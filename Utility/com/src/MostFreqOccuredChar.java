package src;

public class MostFreqOccuredChar {

	public static char mostFreqChar(String s)
	{
		if (s == null || s.isEmpty()) {
	        System.out.println("Invalid input : empty string");
	    }
	    char maxChar = ' ';
	    int count = 0;
	    int[] charCounter = new int[Character.MAX_VALUE + 1];
	    for (int i = s.length() - 1; i >= 0; i--) {
	        char ch = s.charAt(i);
	        if (++charCounter[ch] >= count) {
	        	count = charCounter[ch];
	            maxChar = ch;
	        }
	    }
	    return maxChar;
	}
	public static void main(String[] args) {
		
		String s = "abababaaaaaafffsdfsdfwerweaaaaa";
		
		System.out.println("Most freq char in '" + s + "' is " + mostFreqChar(s));

	}

}
