package essentials;

import java.util.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequencyCount {
	public static void main(String[] args) {
		String test = "avarakedavra";
		printCount(test);
	}

	private static void printCount(String test) {
		Map<Character, Integer> lhm = new LinkedHashMap<>();
		char[] characters = test.toCharArray();
		for (Character a : characters) {
				if(lhm.containsKey(a)){
					lhm.put(a, lhm.get(a)+1);
				}else{
					lhm.put(a, 1);
				}
		}
		for(Character a : lhm.keySet()){
			System.out.println("("+a+", "+lhm.get(a)+")");
		}

	}
}