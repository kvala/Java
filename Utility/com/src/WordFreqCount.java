package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WordFrequency
{
	public Map<String,Integer> wordCount(List<String> list)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : list)
		{
			if(map.containsKey(s)){
				map.put(s, map.get(s) + 1);
			}
			else{
				map.put(s, 1);
			}
		}
		return map;
	}
}
public class WordFreqCount {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Banana");
		list.add("Mango");
		list.add("Mango");
		list.add("Mango");
		list.add("Mango");
		
		WordFrequency obj = new WordFrequency();
		
		Map<String, Integer> result = obj.wordCount(list);
		
		for(String key : result.keySet())
		{
		     System.out.println(key + " : " +result.get(key));
		}
	}
}
