package Maven.Selenium.testing;

import java.util.HashMap;
import java.util.Map;

public class CodingProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Program to find duplicare characterss
		
		String str = "laptop";
		int count = 1;

       Map<Character,Integer> map = new HashMap<Character,Integer>();
       
       char[] arr = str.toCharArray();
       
       for(int i = 0;i<arr.length;i++) {
    	   
    	   if(!map.containsKey(arr[i])) {
    		   
    		   map.put(arr[i], count);
    		   
    	   }
    	   
    	   else {
    		   
    		   map.put(arr[i], map.get(arr[i]+1));
    	   }
    	   
       }
       
 for(Character key:map.keySet()) {
    	   
	 if(map.get(key)>1) {
	   	   
		 
		 System.out.println(key + ":" +map.get(key));
	   	  
	   	   
 	   }
    	 
       }
// 
// Note : in addition if i want to remove the duplicates, i can use below code that i wrote
// 
// else {
//		
//		map.put(arr1[i], map.get(arr1[i]+1));
//		map.remove(arr1[i], map);
//	}
 

	}

}
