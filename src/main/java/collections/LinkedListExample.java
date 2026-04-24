package collections;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args)
	{
		
		LinkedList<String> lList=new LinkedList<>();
		
		//Create
		
		lList.add(0, "Priyanka");
		
		lList.add(1,"Devaansh");
		
		System.out.println(lList);
		
		lList.addFirst("Jagadeesh");
		
		System.out.println(lList);
		
		lList.addLast("Aadhyan");
		
		System.out.println(lList);
		
		//Read
		
		

		System.out.println(lList.getFirst());
		
		
		System.out.println(lList);
		
		//update
		
		lList.set(0, "Mandava");
		
		System.out.println(lList);
		
		//delete
		
		lList.remove(0);
		
		System.out.println(lList);
	}

}
