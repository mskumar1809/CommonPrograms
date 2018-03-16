package essentials;

import java.util.ArrayList;
import java.util.Arrays;
public class ReverseStringWords {
	
		static String rString(String str){
			
			String [] stringArray = str.split(" ");
			ArrayList<String> revArray = new ArrayList<String>();
			for(int i = stringArray.length-1; i>=0; i--) {
				System.out.println(stringArray[i]);
				revArray.add(stringArray[i]);
			}
			
			System.out.println(revArray);
			String listString = String.join(" ", revArray);
			System.out.println(listString);
			
			
			return str ;
		}
		
		public static void main(String [] args ) {
			rString("Hello how are you");
		}

	}

