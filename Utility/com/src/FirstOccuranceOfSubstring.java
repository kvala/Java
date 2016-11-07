package src;

public class FirstOccuranceOfSubstring {
	
	public static int strstr(String haystack, String needle)
	{
	    int hystackpointer = 0; int needlepointer = 0;
	    
	    while(hystackpointer < haystack.length() && needlepointer < needle.length())
	    {
	    	System.out.println(haystack.charAt(hystackpointer) + " = " + needle.charAt(needlepointer) + "?");
	        if(haystack.charAt(hystackpointer) == needle.charAt(needlepointer))
	        {
	            needlepointer++;
	            
	            System.out.println("H = " + hystackpointer + " N = " + needlepointer);
	            System.out.println(needlepointer +"==" + needle.length() );
	            if(needlepointer == needle.length())
	            {
	            	return (hystackpointer - needlepointer+1);
	            }
	            
	        }
	        else 
	        {
	            needlepointer=0;
	        }
	        hystackpointer++;
	    }
	    return -1;	    
	}

	public static void main(String[] args) {
		//System.out.println("aabcdeaabbcabceabcef" +"--" + "abce");
		System.out.println(strstr("aabcdeaabbcabceabcef", "abce"));
		
		System.out.println("aabcdeaabbcabceabcef".indexOf("abce"));
		//System.out.println("-----------------------------------");
		System.out.println(strstr("aaaaaaabcabcaaaabab", "abc"));
		//System.out.println("aaaaaaabcabcaaaabab".indexOf("abc"));
		System.out.println("aababcaaaabab"+"--"+"ab");
		System.out.println(strstr("aababcaaaabab","ab"));
		System.out.println("aababcaaaabab".indexOf("ab"));
	}
}
