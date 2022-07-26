package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("1");
		hs1.add("2");
		hs1.add("3");
		hs1.add(null);
		
		System.out.println(hs1);
		
		 Iterator<String> i = hs1.iterator();
		  
	        // Holds true till there is single element remaining
	        while (i.hasNext()) {
	  
	            // Iterating over elements
	            // using next() method
	            System.out.println(i.next());
	        }
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
		
		lhs1.add("1");
		lhs1.add("2");
		lhs1.add("3");
		lhs1.add(null);
		
		System.out.println(lhs1);
		
		TreeSet<String> set3 = new TreeSet<String>();
		
		set3.add("Rick");
		set3.add("Raj");
		set3.add("Mira");
		set3.add("Reena");
		// set3.add(null); we can not add null value to tree set
		
		System.out.println(set3);
		
		// To remove duplicates from the String
					String str1 = "Clean World Green World";
			//		String result = "Clean World Green";
					
			        HashSet<String> hs11 = new HashSet<String>();
			        for (String word : str1.split(" ")) {
			            hs11.add(word);
			        }
			        System.out.println(hs11);
	}

}
