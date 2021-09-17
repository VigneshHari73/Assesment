package assessment20;

import java.util.HashMap;
import java.util.Map;

public class OccuranceUsingMap {
	
	public static void counter(String given) {	
		
		 HashMap<Character, Integer> test = new HashMap<Character, Integer>();
	          char[] charArray = given.toCharArray();
	     
	      for (char c : charArray){
	         if (test.containsKey(c)){
	        	 test.put(c, test.get(c) + 1);
	         }else{
	        	 test.put(c, 1);
	         }
	      }
	      for (Map.Entry value : test.entrySet()){
	         System.out.println("Occurance of "+value.getKey() + " is " + value.getValue());
	      }
	   }
	
	public static void main(String[] args) {
		
		 String given = "Java";
		  counter(given);
		  
	}
	  
	}




