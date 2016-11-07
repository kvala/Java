package  src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCharsFreq {
	
	public static List<String> charsFrequency(String[] a) {
		
		int count = 0;
		//System.out.println("Length of array = " + a.length);
		
		if(a==null || a.length==0) return null;
		
		if(a.length == 1 && a[0].compareTo(" ") != 0) return Arrays.asList(a);
		
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < a.length-1; i++){
			if((a[i].compareTo(a[i+1]) == 0) && (a[i].compareTo(" ") != 0)){
				//System.out.println(a[i]+" at " + i + " = " + a[i+1] + " at " + (i+1) + "?");
				count++;
				if(i+1 == a.length-1 && count >= 1){
					list.add(a[i]);
					list.add(Integer.toString(count+1));
				}
			}
			else{
				if(a[i].compareTo(" ") != 0) {
					//System.out.println(a[i]);
					list.add(a[i]);
					if(i+1 == a.length-1 && a[i+1].compareTo(" ") != 0)
						list.add(a[i+1]);
				}
				
				if(count >= 1){
					//System.out.println(count+1);
					list.add(Integer.toString(count+1));
				}
				count = 0;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		//String[] a = {"a","a","a","a","b","b","b","c","c","d","d"," ","e"," ","f","f"};
		//String[] a = {"a","b","c","d"};
		//String[] a = {" "," "," "," "};
		String[] a = {" ","a"," ","a"," ","a","a"};
		List<String> list = charsFrequency(a);
		for(String s : list){
			System.out.print(s+ " ");
		}
	}
}