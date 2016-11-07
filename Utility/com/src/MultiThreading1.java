package src;
class MyThread implements Runnable
{
	public static int count = 0;
	
	public MyThread(){
		
	}
	
	public void run(){
		try{
			while(MyThread.count <= 10){
				System.out.println("In MyThread : " + (MyThread.count++));
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e){
			System.out.println("Interrupted thread" + e.getMessage());
		}
	}
}
public class MultiThreading1 {

	public static void main(String[] args) {
		
		System.out.println("Starting main thread..");
		MyThread mt = new MyThread();
		Thread thread = new Thread(mt);
		thread.start();
		try{
			while(MyThread.count <= 10){
				System.out.println("In main Thread : " + (MyThread.count++));
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Interrupted thread" + e.getMessage());
		}
		System.out.println("End of main thread..");
	}
}
