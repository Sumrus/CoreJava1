package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax In map we need key and value where Key=Integer and Value=String
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "Tinu");
		map1.put(4, "Kalu");
		map1.put(3, "Ranu");
		
		System.out.println(map1);
		
		//To add data into map
		
		map1.put(2, "Try");
		
		System.out.println(map1);
		
		//How to iterate through the map
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {
			
			System.out.println(entry1.getKey() + " = " + entry1.getValue());
		}
		
		//Iterate through only keys
		
		for(Integer val: map1.keySet()) {
			
			System.out.println(val);
			System.out.println(map1.get(val)); // to get value with key
		}
		
		
		//Syntax In map we need key and value where Key=Integer and Value=String
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(1, "Tinu");
		map2.put(4, "Kalu");
		map2.put(3, "Ranu");
		
		System.out.println(map2);
		
		map2.put(7, "Try");
		
		System.out.println(map2);
		
		//Syntax In map we need key and value where Key=Integer and Value=String
		
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(1, "Tinu");
		map3.put(4, "Kalu");
		map3.put(3, "Ranu");
		
		System.out.println(map3);
		
		map3.put(2, "Try");
		
		System.out.println(map3);
		
		
		String str = "Clean India Green India Love India";
		
		
		HashMap<String,Integer> map4 = new HashMap<String,Integer>();
		
		 String[] words = str.split(" ");
		 
	        for (String word : words) {
	 
	            
	            Integer integer = map4.get(word);
	 
	            if (integer == null)
	                // Storing the word as key and its
	                // occurrence as value in the HashMap.
	            	map4.put(word, 1);
	 
	            else {
	                // Incrementing the value if the word
	                // is already present in the HashMap.
	            	map4.put(word, integer + 1);
	            }
	        }
	        System.out.println(map4);  

	}

}
