package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {
	
	public static void main(String[] args)
	{
		HashMap<Integer,String> hMap=new HashMap<>();
		
		hMap.put(547, "Priyanka");
		
		hMap.put(560, "Sravani");
		
		hMap.put(579, "VenaglRao");
		
		hMap.put(584, "Mourya teja");
		
		System.out.println(hMap);
		
		hMap.replace(579, "Vemuri");
		
		System.out.println(hMap);
		
		
		
		for(Entry<Integer, String> set:hMap.entrySet())
		{
			System.out.println(set);
		}
		
		hMap.remove(579);
		
		System.out.println(hMap);
		
	}

}
