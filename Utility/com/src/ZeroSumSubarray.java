package src;
import java.util.HashMap;
  
class ZeroSumSubarray {
     
    static String printZeroSumSubarray(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;        
         
        for (int i = 0; i < arr.length; i++)
        {   
            sum += arr[i];
             
            if (arr[i] == 0)
            	return "Found a subarray with sum 0 from " + i + " to " + i;
            else if(sum == 0)
            	return "Found a subarray with sum 0 from 0 to " + i;
            else if(map.get(sum) != null)                            
               return "Found a subarray with sum 0 from " + (map.get(sum)+1)+ " to " + i;
            
            map.put(sum, i);
            	
        }    
         
        return "No subarray found";
    }        
     
    public static void main(String arg[])
    {
        //int arr[] = {4, 2, -3, 1, 6};
    	//int arr[] = {-3, 2, 3, 1, 6};
    	int arr[] = {5,-5,4,2,1,-3,-4,7};
        System.out.println(printZeroSumSubarray(arr));
              
    }            
}