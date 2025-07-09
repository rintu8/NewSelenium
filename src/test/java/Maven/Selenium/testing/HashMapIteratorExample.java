package Maven.Selenium.testing;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Map<String,Integer> maptest = new HashMap<String,Integer>();
		
		maptest.put("Rintu", 10);
		maptest.put("Test", 200);
		
		Map<String,Integer> maptest2 = maptest.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashmap::new));
		
		
		for(String key : maptest.keySet()) {
			
			System.out.println(key+ "" +maptest.get(key));
		}

	}
	
	

}
