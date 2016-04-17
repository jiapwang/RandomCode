//Rövarspråket is not very complicated: you take an ordinary word and replace 
//the consonants with the consonant doubled and with an "o" in between. So the 
//consonant "b" is replaced by "bob", "r" is replaced with "ror", "s" is replaced 
//with "sos", and so on. Vowels are left intact. It's made for Swedish, but it works 
//just as well in English. Your task today is to write a program that can encode a 
//string of text into Rövarspråket. 

import java.util.Scanner; 

public class Rovarspraket {
	public static void main (String args []) {
		Scanner input = new Scanner (System.in); 
		String newSentence = ""; 
		
		System.out.print("Please enter a sentence for encryption: ");
		String original = input.nextLine();
		
		for (int i = 0; i< original.length(); i++) {
			if ("bcdfghjlklmnpqrstvwxyz".contains(original.toLowerCase().charAt(i)+"")) {
				newSentence += original.charAt(i) + "o" + original.charAt(i);
			}
			else {
				newSentence += original.charAt(i);
			}
		}
		System.out.println("Original: " + original + "\n" + "New Sentence: " + newSentence); 
	}
}
