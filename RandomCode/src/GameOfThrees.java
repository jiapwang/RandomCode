//The input is a single number: the number at which the game starts. Write a program that 
//plays the Threes game, and outputs a valid sequence of steps you need to take to get to 1. 
//Each step should be output as the number you start at, followed by either -1 or 1 
//(if you are adding/subtracting 1 before dividing), or 0 (if you are just dividing).
//The last line should simply be 1.

import java.util.Scanner; 

public class GameOfThrees {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in); 
		
		System.out.print("Please input an integer value: ");
		int n = input.nextInt();
		
		if (n <= 0) {
			System.out.println("Cannot play game with this number! GG");
			return;
		}
			
		while (n != 1) {
			if (n%3 == 0) {
				System.out.println(n + " " + "0");
				n = n/3;
			}
			else if (n%3 == 1) {
				System.out.println(n + " " + "-1");
				n = (n-1)/3;
			}
			else if (n%3 == 2) {
				System.out.println(n + " " + "+1");
				n = (n+1)/3;
			}	
		}
		System.out.println(n + "\n" + "GG");
		
	}
}
