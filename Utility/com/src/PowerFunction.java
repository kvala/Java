package src;

public class PowerFunction {

	public static double power(double x, int n) {
		if (n == 0)
			return 1;
	 
		double v = power(x, n / 2);
	 
		if (n % 2 == 0) {
			return v * v;
		} else {
			return v * v * x;
		}
	}
	 
	public static double pow(int x, int n) {
		if (n < 0) {
			return 1 / power(x, -n);
		} else {
			return power(x, n);
		}
	}
	public static void main(String[] args) {
		System.out.println("2^(-4) is " + pow(2,-4));
		System.out.println(Math.pow(2, -4));
	}

}
