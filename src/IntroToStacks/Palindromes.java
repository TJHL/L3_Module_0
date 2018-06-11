package IntroToStacks;

import java.util.Stack;

public class Palindromes {

	boolean isPalindrome(String possiblePalindrome) {
		Stack <Character> palNumber = new Stack <Character>();
		String palTest = "";
		String simpPal = "";

		
		for (int i = 0; i < possiblePalindrome.length(); i++) {
			char c = possiblePalindrome.charAt(i);
			if(c==' '||c==','||c=='.'||c=='?'||c=='!') {
				
			}else {
				char f = Character.toLowerCase(c);
				simpPal+=(f);
			}
		}
		for (int i = 0; i < simpPal.length(); i++) {
			palNumber.push(simpPal.charAt(i));
		}
		
		for (int i = 0; i < simpPal.length(); i++) {
			if(!palNumber.isEmpty()) {
			palTest = palTest + palNumber.pop();}
		}
		System.out.println(palTest);
		System.out.println(simpPal);
		if (palTest.equals(simpPal)) {
			return true;
		} else
		
		return false;
	}
}