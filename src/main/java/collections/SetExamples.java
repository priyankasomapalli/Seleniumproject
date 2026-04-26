package collections;

import java.util.HashSet;

public class SetExamples {
	
	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<>();
		//Create
		set.add("Priyanka");
		
		set.add("Raj");
		
		set.add("Sravani");
		
		set.add("Farah");
		
		//Read
		
		System.out.println(set);
		
		for(String name:set)
		{
			System.out.println(name);
		}
		
		//Update
		
		set.remove("Raj");
		
		System.out.println(set);
		
		
	
		
		
		
	}

}
