package src;

public class PairsWithLeastAbsDifference {

	public static void leastDiffPairs(int[] a){
		
		int leastdiff = Math.abs(a[0] - a[1]);
		for(int i = 1; i < a.length-1; i++){
			
			if(Math.abs(a[i] - a[i+1]) < leastdiff){
				leastdiff = Math.abs(a[i] - a[i+1]);
			}
		}
		System.out.println("Least difference is " + leastdiff );
	}
	public static void main(String[] args) {
		
		int[] a = {10,122,4,7,30,56,550,49,35};
		leastDiffPairs(a);
	}
}
