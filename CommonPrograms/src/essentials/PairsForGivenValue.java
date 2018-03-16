package essentials;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class PairsForGivenValue {

public static void main(String[] args) {
		
		int[] array = {0, 1, 2, 2, 3, 4, 5};
		int N = 4;
	
		for (int i = 0,j=array.length-1; i < (array.length/2) && i!=j ;) {
			if (array[i]+array[j] > N)
				j--;
			else if (array[i]+array[j] < N)
				i++;
			else {
				System.out.println("(" + array[i] + " , " + array[j] + ")");
			    j--;
			}
		}	}
}
