package Maven.Selenium.testing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class selfLearning {

	//remove dupicates from sorted array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String str1 = "laptop";





int count =1;

char[] arr1 = str1.toCharArray();

Map<Character,Integer> map = new HashMap<Character,Integer>();

for(int i =0;i<arr1.length;i++) {
	
	
	if(!map.containsKey(arr1[i])) {
		
		map.put(arr1[i], count);
		
	}
	else {
		
		map.put(arr1[i], map.get(arr1[i]+1));
		map.remove(arr1[i], map);
	}
}

for(Character x : map.keySet()) {
	
		
		System.out.println(x +" :"  +map.get(x));
	
}

	}

}
