package src;

public class BinarySearch {

	public static boolean binarySearch(int[] a, int start, int end, int n)
	{
		if (start > end) 
			return false;
		
		int mid = end + start / 2;
		
		if(n == a[mid])
			return true;
		
		else if(n < a[mid])
			return binarySearch(a, start, mid-1, n);
		
		else
			return binarySearch(a, mid+1, end, n);
	}
	
	public static void main(String[] args) {
		
		int[] nums = {10,15,20,25,30,35,40,45,50,55,60};
		System.out.println(binarySearch(nums,0,nums.length-1,60));

	}

}
