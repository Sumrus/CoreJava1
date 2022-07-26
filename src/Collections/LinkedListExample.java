package Collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("John");
		list.add("Rahul");
		list.add("Rusia");
		list.addFirst("Sumit");
		list.addLast("Golu");
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

	}

}
