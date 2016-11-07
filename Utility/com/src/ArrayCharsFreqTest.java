package src;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;


public class ArrayCharsFreqTest {
	
	//Positive test case
	@Test
	public void testCharsFrequency() {
		ArrayCharsFreq chars = new ArrayCharsFreq();
		String[] a = {"a","a","a","a","b","b","b","c","c","d","d"," ","e"," ","f","f"};
		@SuppressWarnings("static-access")
		List<String> res = chars.charsFrequency(a);
		String[] out = {"a","4","b","3","c","2","d","2","e","f","2"};
		assertArrayEquals(res.toArray(), out);
	}

	//Test case : 2
	@Test
	public void testCharsFrequency2()
	{
		ArrayCharsFreq chars = new ArrayCharsFreq();
		String[] a = {"a","a","a","a"};
		List<String> res = chars.charsFrequency(a);
		String[] out = {"a","4"};
		assertArrayEquals(res.toArray(), out);
	}
	
	//Test case : 3
	@Test
	public void testCharsFrequency3()
	{
		ArrayCharsFreq chars = new ArrayCharsFreq();
		String[] a = {"a"};
		@SuppressWarnings("static-access")
		List<String> res = chars.charsFrequency(a);
		String[] out = {"a"};
		assertArrayEquals(res.toArray(), out);
	}
	
		//Test case : 4
		@Test
		public void testCharsFrequencyWithNullCheck()
		{
			ArrayCharsFreq chars = new ArrayCharsFreq();
			String[] a = null;
			assertNull(chars.charsFrequency(a));
		}
		
		//Test case : 5
		@Test(expected = NullPointerException.class)
		public void testCharsFrequencyWithEmptyarray()
		{
			ArrayCharsFreq chars = new ArrayCharsFreq();
			String[] a = {};
			@SuppressWarnings("static-access")
			List<String> res = chars.charsFrequency(a);
			String[] out = null;
			assertArrayEquals(res.toArray(), out);
		}
		
		//Test case : 6
		@Test
		public void testCharsFrequencyWithOneFreq()
		{
			ArrayCharsFreq chars = new ArrayCharsFreq();
			String[] a = {"a","b","c","d"};
			@SuppressWarnings("static-access")
			List<String> res = chars.charsFrequency(a);
			String[] out = {"a","b","c","d"};
			assertArrayEquals(res.toArray(), out);
		}
		
		//Test case : 6
		@Test
		public void testCharsFrequencyWithMissingChars()
		{
			ArrayCharsFreq chars = new ArrayCharsFreq();
			String[] a = {"a","a","a"," "};
			@SuppressWarnings("static-access")
			List<String> res = chars.charsFrequency(a);
			String[] out = {"a","3"};
			assertArrayEquals(res.toArray(), out);
		}
		
		//Test case : 6
		@Test
		public void testCharsFrequencyWithMissingCharsOnly()
		{
			ArrayCharsFreq chars = new ArrayCharsFreq();
			String[] a = {" "," "," "," "};
			@SuppressWarnings("static-access")
			List<String> res = chars.charsFrequency(a);
			String[] out = {};
			assertArrayEquals(res.toArray(), out);
		}
		
		//Test case : 7
		@Test
		public void testCharsFrequencyWithOneMissingChar()
		{
			ArrayCharsFreq chars = new ArrayCharsFreq();
			String[] a = {" "};
			@SuppressWarnings("static-access")
			List<String> res = chars.charsFrequency(a);
			String[] out = {};
			assertArrayEquals(res.toArray(), out);
		}
		
		//Test case : 8
		@Test
		public void testCharsFrequencyWithMissingCharsAlternate()
		{
			ArrayCharsFreq chars = new ArrayCharsFreq();
			String[] a = {" ","a"," ","a"," ","a","a"};
			@SuppressWarnings("static-access")
			List<String> res = chars.charsFrequency(a);
			String[] out = {"a","a","a","2"};
			assertArrayEquals(res.toArray(), out);
		}
}
