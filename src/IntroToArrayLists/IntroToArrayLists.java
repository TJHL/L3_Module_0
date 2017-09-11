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
		
		System.out.println("\n");
		
		for(int i=0;i<(listName.size()/2)+2;i=i+2) {
			String s = listName.get(i);
			System.out.println(s);
		}
		System.out.println("\n");

		for(int i=(listName.size()-1);i>=0;i--) {
			String s = listName.get(i);
			System.out.println(s);
		}
		System.out.println("\n");

		for(int i=0;i<listName.size();i++) {
			String s = listName.get(i);
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}