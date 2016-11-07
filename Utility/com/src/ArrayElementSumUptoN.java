package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayElementSumUptoN {

	public static void findPairWithSumUptoN(int[] a, int n){
		
		int i = 0;
		int j = a.length - 1;
		int sum = 0;
		Arrays.sort(a);
		List<String> list = new ArrayList<String>();
		
		while(i < j){
			sum = a[i] + a[j];
			if(sum == n){
				list.add(a[i]+","+a[j]);
				i++;
				j--;
			}
			else if(sum < n)
				i++;
			else
				j--;
		}
		
		if(list.size()==0)
			System.out.println("No pairs found!");
		
		for(String s : list){
			System.out.println(s);
		}
		
	}
	
	public static void findElementsWithSumUptoN(int[] a, int n){
		
		int i = 0;
		int j = a.length - 1;
		int sum = 0;
		Arrays.sort(a);
		List<String> list = new ArrayList<String>();
		
		while(i < j){
			sum = a[i] + a[i+1] + a[j] ;
			if(sum == n){
				list.add(a[i]+","+a[i+1]+","+a[j]);
				i++;
				j--;
			}
			else if(sum < n)
				i++;
			else
				j--;
		}
		
		if(list.size()==0)
			System.out.println("No pairs found!");
		
		for(String s : list){
			System.out.println(s);
		}
		
	}
	
	public static void findFourElementsWithSumUptoN(int[] a, int n){
		
		int i = 0;
		int j = a.length - 1;
		int sum = 0;
		Arrays.sort(a);
		List<String> list = new ArrayList<String>();
		
		while(i+1 < j-1){
			sum = a[i] + a[i+1] + a[j-1] + a[j] ;
			if(sum == n){
				list.add(a[i]+","+a[i+1]+","+a[j-1]+","+a[j]);
				i++;
				j--;
			}
			else if(sum < n)
				i++;
			else
				j--;
		}
		
		if(list.size()==0)
			System.out.println("No pairs found!");
		
		for(String s : list){
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		
		int[] a = {2,45,7,3,5,1,8,9};
		findPairWithSumUptoN(a, 10);
		findElementsWithSumUptoN(a, 10);
		findFourElementsWithSumUptoN(a, 11);
	}
}
