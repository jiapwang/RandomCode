/*
Disemvoweling means removing the vowels from text. (For this challenge, the 
letters a, e, i, o, and u are considered vowels, and the letter y is not.) 
The idea is to make text difficult but not impossible to read, for when somebody 
posts something so idiotic you want people who are reading it to get extra frustrated.
Input description

A string consisting of a series of words to disemvowel. It will be all lowercase 
(letters a-z) and without punctuation. The only special character you need to handle 
is spaces.

Two strings, one of the disemvoweled text (spaces removed), and one of all the removed vowels.
*/

import java.util.Scanner; 

public class Disemvoweler {
	public static void main (String args []) {
		Scanner input = new Scanner(System.in); 
		String original, disemvoweled = "", removedVowels=""; 
		
		System.out.print("Please enter a sentence you would like to disemvowel: ");
		original = input.nextLine();
		input.close();
		
		original = original.replace(" ", "");	//delete all the spaces in the sentence
			
		for (int i = 0; i < original.length(); i++) {
			if ("aeiou".contains(original.toLowerCase().charAt(i)+"")) 
				removedVowels += original.charAt(i);	
			else 
				disemvoweled += original.charAt(i);	
		}
		System.out.print("Disemvoweled text: " + disemvoweled + "\n" + "Vowels removed: " + removedVowels);
	}
	
}
