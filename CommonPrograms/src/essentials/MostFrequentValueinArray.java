package essentials;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MostFrequentValueinArray {
	
	public static void getNthMostFrequent(int[] a) {
		  TreeMap<Integer, Integer> Tempmap = new TreeMap<Integer, Integer>();
		  int maxCount=0, freqValue = -1;
		  for(int i=0; i < a.length; i++) {
		     if(Tempmap.get(a[i]) == null) { //Insert new.
		    	 Tempmap.put(a[i], 1);
		     }else { //Already exists. Just increment the count.
		        int count = Tempmap.get(a[i])+1;
		        Tempmap.put(a[i], count);    
		     }
		 
		 }
		  int maxValueInMap=(Collections.max(Tempmap.values()));
		  Map<Integer, Integer> result = Tempmap.entrySet() 
		          .stream() 
		          .filter(map -> map.getValue() == maxValueInMap ) 
		          .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  
		  System.out.println(result);
		}

		public static void main(String[] args) {
			int[] a = {3,3,3,5,10,44,11,44,100,102,102,102};
			getNthMostFrequent(a);
		}
		
		
		
	}


