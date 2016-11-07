package src;

public class FizzBuzz {

	public static void fizzbuzz(int n) {
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0)
				System.out.println(i+ " : fizzbuzz");
			else if(i % 5 == 0)
				System.out.println(i + " : buzz");
			else if(i % 3 == 0 )
				System.out.println(i + " : fizz");
		}
		

		
			//System.out.println(n);
	}
	public static void main(String[] args) {
		fizzbuzz(0);

	}

}
