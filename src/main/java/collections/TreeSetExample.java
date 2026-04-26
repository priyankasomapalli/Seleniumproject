package collections;

import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args)
	{
		TreeSet<String> tSet=new TreeSet<>();
		
		tSet.add("Yathisha");
		
		tSet.add("Sravani");
		
		tSet.add("Teja");
		
		tSet.add("Sasi");
		
		System.out.println(tSet);
		
		boolean val=tSet.contains("Sasi");
		
		System.out.println(val);
		
		int size=tSet.size();
		
		System.out.println(size);
		
		tSet.remove("Sasi");
		
		System.out.println(tSet);
		
	}

}
