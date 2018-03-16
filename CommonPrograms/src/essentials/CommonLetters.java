package essentials;

public class CommonLetters {

	public static void main(String[] args) {

		String x ="String";
		String y = "Strong";
		String result="";
		char[] arrayX = x.toCharArray();
		char[] arrayY = y.toCharArray();
		for(int i = 0; i<arrayX.length; i++) {
			if(arrayX[i]==arrayY[i]) {
				result = result+arrayX[i];
			}		
		}
		System.out.println(result);
	}		
}