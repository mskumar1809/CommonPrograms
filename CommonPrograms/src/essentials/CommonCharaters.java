package essentials;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CommonCharaters {

	public static void CommonAlp(String s, String s1){
		
		String combinedString = s+s1;
		
		char[] charArray = combinedString.toLowerCase().toCharArray();
		LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();
		for(Character letter: charArray) {
			if(charCount.get(letter) == null) { //Insert new.
				charCount.put(letter, 1);
		     }else { //Already exists. Just increment the count.
		        int count = charCount.get(letter)+1;
		        charCount.put(letter, count);    
		     }
			
		 } 
		String result = charCount.entrySet().stream()
				.filter(map -> "2".equals(map.getValue().toString()))
				.map(map->map.getKey().toString())
				.collect(Collectors.joining());
		System.out.println(result);
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonAlp("Strong", "String");
		
	}

}