package Maven.Selenium.testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class selfLearning {

	//remove dupicates from sorted array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Program to find duplicare characterss
		
		String str = "laptop";
		int count=1;
		
		char []arr = str.toCharArray();
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(!map.containsKey(arr[i])) {
				
				map.put(arr[i],count );
			}
			else {
				
				map.put(arr[i], count+1);
			}
		}
		
		
	for(Character key: map.keySet()) {
			
if(map.get(key)>1) {
			
				System.out.println(key + " The duplicate characters are " +map.get(key));
			
}
			
			
		}
	}
	
	
	
}
