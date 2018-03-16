package essentials;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElement {
	

	public static void main(String[] args) {

		int[] data = { 4, 3, 1, 3, 5, 9, 5, 4 };
		LinkedHashMap<Integer, Integer> lookup = new LinkedHashMap<Integer, Integer>();
		for (int temp : data) {
			if (lookup.containsKey(temp)) {
				lookup.put(temp, lookup.get(temp)+1);
			} else {
				lookup.put(temp, 1);
			}
		}
		Map<Integer, Integer> result = lookup.entrySet() 
		          .stream() 
		          .filter(map -> map.getValue() >= 2) 
		          .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  
		
			  System.out.println(lookup);
		      System.out.println("Result: " + result);
	}
}