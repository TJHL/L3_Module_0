package IntroToHashMaps;

import java.util.HashMap;

public class IntroToHashMaps {
	public static void main(String[] args) {
	HashMap<Integer, Double> roots = new HashMap<Integer, Double>();
	
	for(int i=0;i<501;i++) {
		roots.put(i, Math.sqrt(i));
		
		System.out.println("The square Root of "+i+" is "+Math.sqrt(i));
		
	}
	
	//3. Iterate through all the entries in your HashMap displaying the keys with their respective
	//   square roots (values). Use the following format.
	
	//   The square Root of 0 is 0.0
	//   The square Root of 1 is 1.0
	//   The square Root of 2 is 1.4142135623730951
	//   The square Root of 3 is 1.7320508075688772
}
}