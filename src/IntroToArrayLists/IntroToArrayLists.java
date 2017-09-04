package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		ArrayList<String> listName = new ArrayList<String>();
		
		listName.add("The");
		listName.add("cat");
		listName.add("is");
		listName.add("on");
		listName.add("my");
		listName.add("*Thump!!*");

		for(int i=0;i<listName.size();i++) {
			String s = listName.get(i);
			System.out.println(s);
		}
		
		System.out.println("\n");
		
		for(String s: listName) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
