package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> gargle = new ArrayList<String>();
		//2. Add five Strings to your list
		gargle.add("unruly");
		gargle.add("acrid");
		gargle.add("impulse");
		gargle.add("famous");
		gargle.add("upset");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < gargle.size(); i++) {
			System.out.println(gargle.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String str : gargle) {
			System.out.println(str);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < gargle.size(); i++) {
			if (i%2 == 0) {
				System.out.println(gargle.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = gargle.size(); i > 0; i--) {
			System.out.println(gargle.get(i-1));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < gargle.size(); i++) {
			if (gargle.get(i).contains("e")) {
				System.out.println(gargle.get(i));
			}
		}
	}
}
