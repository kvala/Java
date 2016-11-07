package src;

class HashEntry
{
	private int key,value;
	
	public HashEntry(int k, int v)
	{
		key = k;
		value = v;
	}
	public int getKey()
	{
		return key;
	}
	public int getValue()
	{
		return value;
	}
}

class MyHashTable
{
	public static final int TABLE_SIZE = 128;
	HashEntry[] table;
	
	public MyHashTable()
	{
		table = new HashEntry[TABLE_SIZE];
		for(int i = 0; i < table.length; i++)
		{
			table[i] = null;
		}
	}
	
	public int get(int key)
	{
		//int hash2 = Integer.toString(key).hashCode();
		int hash = key % TABLE_SIZE;
		
		while(table[hash] != null && table[hash].getKey() != key)
		{
			hash = (hash + 1) % TABLE_SIZE;
		}
		if(table[hash] == null)
			return -1;
		else
			return table[hash].getValue();
	}
	
	public void put(int key, int value)
	{
		int hash = key % TABLE_SIZE;
		
		while(table[hash] != null && table[hash].getKey() != key)
		{
			hash = (hash + 1) % TABLE_SIZE;
		}
		table[hash] = new HashEntry(key, value);
	}
	
	public MyHashTable freqCount(int[] list)
	{
		MyHashTable map = new MyHashTable();
		
		for(int i : list)
		{
			if(map.get(i) > 0){
				map.put(i, map.get(i) + 1);
			}
			else{
				map.put(i, 1);
			}
		}
		return map;
	}
	
	public void printTable()
	{
		for(int i = 0; i < table.length; i++ )
		{
			if(table[i] != null && table[i].getKey() > 0)
			{
				System.out.println("Key : " + table[i].getKey() + " Value : " + table[i].getValue());
			}
		}

	}
}

public class HashTableImplementation {

	public static void main(String[] args) {
		
		MyHashTable table = new MyHashTable();
		
		int[] a = {1,2,3,4,5,1,2,3,4,5,6,7,6,5,6,7,8,5,3,8};
		
		MyHashTable result = table.freqCount(a);
		result.printTable();
		
	}

}
