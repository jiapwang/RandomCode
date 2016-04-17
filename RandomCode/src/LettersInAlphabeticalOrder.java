import java.util.*;

public class LettersInAlphabeticalOrder {
	public static void main (String args []) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a word for analysis (type 'done' when finished): "); 
		String Word = input.nextLine();
		
		while (Word.toLowerCase() != "done" ) {
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
		input.close();
	}
}
