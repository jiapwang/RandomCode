/*
Write a program that can determine if the letters in a word are in alphabetical order.
*/

import java.util.*;

public class LettersInAlphabeticalOrder {
	public static void main (String args []) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a word for analysis (type 'done' when finished): "); 
		String Word = input.nextLine();
		
		while (!Word.toLowerCase().equals("done")) {
			boolean Alphabetical=true; 
			for (int i = 1; i < Word.length(); i++) {
				if (Word.toLowerCase().charAt(i) < Word.toLowerCase().charAt(i-1))
					Alphabetical = false; 
			}
			if (Alphabetical == false) {
				System.out.println(Word + " NOT IN ALPHABETICAL ORDER!");
			}
			else 
				System.out.println(Word + " IN ALPHABETICAL ORDER!");
			
			System.out.print("Please enter a word for analysis (type 'done' when finished): "); 
			Word = input.nextLine();
		}
		System.out.println("Thanks for using this amazing program! Until next time. Buh Bye!");
		input.close();
	}
}
