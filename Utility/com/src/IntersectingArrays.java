package src;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Intersection
{
	public List<Integer> intersectArrays(int[] a, int[] b){
		
		List<Integer> result = new ArrayList<Integer>();
		
		Set<Integer> set = new HashSet<Integer>();
		for(int num : a){
			set.add(num);
		}
		
		for(int num : b){
			if(set.contains(num)){
				result.add(num);
			}
		}
			
		return result;
	}
}

public class IntersectingArrays {

	public static void main(String[] args) {
		Intersection obj = new Intersection();
		
		int[] a = {1,3,6,5,8,9,4};
		int[] b = {1,5,7,2,9};
		List<Integer> res = obj.intersectArrays(a, b);
		for(int i : res){
			System.out.print(i + " ");
		}		
	}
}
