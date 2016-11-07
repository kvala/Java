package com.ratelimit;

import java.util.concurrent.TimeUnit;

public class RaterLimiterHelper {
	int rate;
	int per;
	long lastchecked;
	int allowed;

	public RaterLimiterHelper(int rate, int per) {
		this.lastchecked = System.currentTimeMillis();
		this.rate = rate;
		this.per = per;
		this.allowed = rate;

	}

	public boolean process(String message) {
		long current = System.currentTimeMillis();
		long timedifference = (current - lastchecked);

		if (timedifference >= TimeUnit.SECONDS.toMillis(per)) {
			allowed = rate;
			lastchecked = current;
		}

		System.out.print(message);
		Boolean retValue = false;
		if (allowed >= 0) {
			// forward message to service function;
			System.out.println(" Allow");
			retValue = true;

		} else {
			// throttle
			System.out.println(" Throttle");
		}
		allowed -= 1;

		return retValue;
	}

	public static void main(String[] args) throws InterruptedException {
		RaterLimiterHelper ratelimiter = new RaterLimiterHelper(11, 1);
		
		for (int i = 0; i <= 12; i++) {
			ratelimiter.process(Integer.toString(i));
		}
		
		Thread.sleep(5000L);

		System.out.println("**********After 5 sec*********");
		for (int i = 0; i <= 12; i++) {
			ratelimiter.process(Integer.toString(i));
		}

	}
}
