package essentials;

public class ReverseStringCharacters {


		static String rString(String str){
		
			StringBuilder sb = new StringBuilder();
			
			for (int i = str.length()-1; i >=0; i--) {
				sb.append(str.charAt(i));
				
			}
			
			
			
			return sb.toString();
				
			
		}
		
		public static void main(String[] args) {
			
			
			System.out.println(rString("Trying is Good"));

		}

	}

