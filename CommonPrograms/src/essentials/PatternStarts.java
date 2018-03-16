package essentials;

public class PatternStarts {
	

		public static void main (String args[]){ 
		int n = 5; 
		if(n%2==0) {
			System.out.println("Only Odd numbers allowed");
		}
		
		else {
		
		for (int i=1; i<=n; i=i+2){ 
		for (int j=1; j<=i; j++){ 
		System.out.print("*");	
		}	
		System.out.print("\n"); 
		} 
		for (int i=n-2; i>=1; i=i-2){ 
		for (int j=1; j<=i; j++){ 
		System.out.print("*");	
		}	
		System.out.print("\n"); 
		}	
		} 
		}
}

