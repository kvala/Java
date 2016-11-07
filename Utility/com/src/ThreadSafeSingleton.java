package src;

public class ThreadSafeSingleton {

	private static final ThreadSafeSingleton obj = null;
	
	private ThreadSafeSingleton(){
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance(){
		if(obj == null)
			return new ThreadSafeSingleton();
		else
		{
			System.out.println("Not new");
			return obj;
		}
			
	}
	
	public static void printMsg()
	{
		System.out.println("In ThreadSafeSingleton class");
	}
	
	public static void main(String[] args) {
		
		ThreadSafeSingleton obj = ThreadSafeSingleton.getInstance();
		obj.printMsg();
		
	}

}
