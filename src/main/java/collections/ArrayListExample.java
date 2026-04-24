package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();

		// Create
		
		aList.add(0, "Jagadeesh");
		
		aList.add(1,"Priyanka");
		
		aList.add(2,"Devaansh");
		
		aList.add("Aadhyan");
		
		System.out.println(aList);
		
		//for(String name : aList)
		//{
			//System.out.println(name);
		//}
		
		//Read
		
		//aList.get(2);
		
		System.out.println(aList.get(2));
		
		//update
		
		aList.add(2, "Devaansh Mandava");
		
		System.out.println(aList);
		
		aList.set(0, "Mandava");
		
		//remove
		aList.remove(2);
		
		System.out.println(aList);
		
		
		aList.clear();
		
		System.out.println(aList);
		
		
		
		
		

	}

}
