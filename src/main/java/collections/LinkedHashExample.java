package collections;

import java.util.LinkedHashSet;

public class LinkedHashExample {
	
	public static void main(String[] args)
	{
		LinkedHashSet<String> lSet=new LinkedHashSet<>();
		
		lSet.add("Kartehek");
		
		lSet.add("Mourya");
		
		lSet.add("Bhargavi");
		
		System.out.println(lSet);
		
		System.out.println(lSet.iterator());
		
		lSet.remove("Bhargavi");
		
		System.out.println(lSet);
		

	}
	
	
}
