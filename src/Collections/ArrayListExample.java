package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ArrayList Syntax */
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		/*Storing Value in ArrayList*/
		
		arraylist1.add("RAJ"); // 0 index 
		arraylist1.add("Priya"); // 1 index
		arraylist1.add("Nikhil"); //.....
		arraylist1.add("Dash"); //.....
		arraylist1.add("Rahul");//....
		arraylist1.add("Manish");// 5 index
		arraylist1.add("Rest"); // 6 index
		
		/* Finding the size of ArrayList*/
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		
		/*Removing the data from the arraylist */
		
		arraylist1.remove(0);
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		
		
		/*Printing array data*/
		
		System.out.println(arraylist1);
		
		// Looping through Arraylist 1st method//
		
		for(int i=0;i<arraylist1.size();i++) {
			
			System.out.println(arraylist1.get(i));
		}
		
		//2nd Method//
		
		for(String name:arraylist1) {
			System.out.println(name);
		}
		
		//3rd Method Iterator //
		
		Iterator<String> itr = arraylist1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		//Sorting arraylist//
		
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
		Collections.sort(arraylist1, Collections.reverseOrder());
		System.out.println(arraylist1);
		
		Collections.reverse(arraylist1);
		System.out.println(arraylist1);
		
		
		
		

	}

}
