package src;

public class firstOccuranceOfSubstr {

	public static int firstIndexOf(String haystack, String needle)
	{
		int hlen = haystack.length();
		int nlen = needle.length();
		int j = 0;
		
		for(int i = 0; i < hlen; i++){
			if(haystack.charAt(i) == needle.charAt(j)){
				j++;
				if(j == nlen)
					return i - nlen;
			}
			else{
				j = 0;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(firstIndexOf("aabcdeaabbcabceabcef", "abce"));
		System.out.println("aabcdeaabbcabceabcef".indexOf("abce"));
		System.out.println("-----------------------------------");
		System.out.println(firstIndexOf("aaaaaaabcabcaaaabab", "abc"));
		System.out.println("aaaaaaabcabcaaaabab".indexOf("abc"));
		System.out.println(firstIndexOf("aaaaaaaababcaaaabab","ab"));
		System.out.println("aaaaaaaababcaaaabab".indexOf("ab"));

	}

}
