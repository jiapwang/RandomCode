/*
DNA - deoxyribonucleic acid - is the building block of every organism. 
It contains information about hair color, skin tone, allergies, and more. 
It's usually visualized as a long double helix of base pairs. DNA is composed 
of four bases - adenine, thymine, cytosine, guanine - paired as follows: A-T and G-C. 

It is your job to generate one side of the DNA strand and output the two DNA strands. 
Your program should take a DNA sequence as input and return the complementary strand. 
 */

import java.util.Scanner; 

public class DNA_Replication {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in); 
		System.out.print("Please enter a DNA sequence you would like to complement: ");
		String original = input.nextLine();
		String data = "ATCG TAGC";
		String complement = ""; 
		
		for (int i = 0; i < original.length(); i ++) {
			if("ATCG".contains(original.toUpperCase().charAt(i)+"")) {
				
				complement += data.charAt(data.indexOf(original.toUpperCase().charAt(i))+5);
			}
			else {
				System.out.println("The sequence contains one or more errors! Program terminating!");
				return;
			}
		}
		System.out.print("Original: " + original.toUpperCase() + "\n" + "Complement: " + complement);
	}
}
