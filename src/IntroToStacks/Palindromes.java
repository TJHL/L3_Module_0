package IntroToStacks;

import java.util.Stack;

public class Palindromes {

	boolean isPalindrome(String possiblePalindrome) {
		Stack palNum = new Stack();
		String palTest = new String();

		for (int i = 0; i < possiblePalindrome.length(); i++) {

			palNum.push(possiblePalindrome.charAt(i));
		}
		for (int i = 0; i < possiblePalindrome.length(); i++) {
			palTest = palTest + palNum.pop();
		}
		if (palTest == possiblePalindrome) {
			return true;
		} else
			;
		return false;
	}
}
