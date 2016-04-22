/*
Atbash is a simple substitution cipher. It works by substituting the first letter of an 
alphabet for the last letter, the second letter for the second to last and so on, effectively
reversing the alphabet. 
	Here is the Atbash substitution table: 
		Plain:  abcdefghijklmnopqrstuvwxyz
		Cipher: ZYXWVUTSRQPONMLKJIHGFEDCBA
		
For this challenge you'll be asked to implement the Atbash cipher and encode (or decode) 
some English language words.
*/

import java.util.Scanner; 

public class AtbashCipher {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in); 
		String alphabets = "abcdefghijklmnopqrstuvwxyz"; 
		String encryptedData="";
		
		System.out.println("Enter word or phrase for encryption (type 'null' when finish): ");
		String data =  input.nextLine();
		
		while (!data.equals("null")) {
		
			for (int i = 0; i < data.length(); i++) {
				if (alphabets.contains(data.toLowerCase().charAt(i)+""))
					encryptedData += alphabets.charAt(25 - alphabets.indexOf(data.toLowerCase().charAt(i)));
				else {
					encryptedData += data.charAt(i); 
				}
			}
			
			System.out.println(encryptedData);
			System.out.println("Enter word or phrase for encryption (type 'null' when finish): ");
			data =  input.nextLine();
			encryptedData = "";
		}
		System.out.println("Thank you for using, and remember security first!");
	}
}
