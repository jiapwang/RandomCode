import java.util.Scanner;

public class BullsAndCows {
	public static void main (String args[]) {
		String myNum = "011"; 
		String friendGuess = "0";
		String hint = "";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Secret number is " + myNum.length() + " digits long!");
		while (!friendGuess.equals(myNum)) {
			System.out.println("Please enter your numerical guess, friend.");
			friendGuess = input.nextLine();
			hint = getHint(myNum, friendGuess);
			System.out.println(hint);
		}	
	}
	
	public static String getHint(String secret, String guess) {
		int bull = 0; 
		int cow = 0;
		
		char[] sec = secret.toCharArray();
		char[] gues = guess.toCharArray();
		
		for (int i = 0; i < secret.length(); i++) {
			if (sec[i] == gues[i]) {
				bull++;
			}
			else {
				for (int z = 0; z < secret.length(); z++) {
					if (gues[i] == sec[z] && z != i) {
						cow++;
						break;
					}
				}
				
			}
		}
		return bull+"A"+cow+"B";
	}
}
