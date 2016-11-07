package src;
public class OddsEvens {

	public static int[] segregateOddsEvens(int[] a) {
		
		int i = 0;
		int temp = 0;
		int j = a.length - 1;
		
		while(i < j) 
		{
			
			while(a[i] % 2 == 0 && i < j ){
				i++;
			}
				
			while(a[j] % 2 != 0 && i < j){
				j--;
			}
			if(i < j){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++; j--;
			}
		}
		return a;
	}
	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		int[] a = {12, 34, 45, 9, 8, 90, 3};
		int[] res = segregateOddsEvens(a);
		for(int i : res){
			System.out.print(i + " ");
		}
	}
}
