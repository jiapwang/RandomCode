//Jia Wang
//Professor Yanofsky
//Algorithms

/*
 * This program prompts the user to enter a value. It takes this value and runs
 * through the list of 5 functions to find which one is the fastest and most 
 * efficient. It then prints out the function to the screen.
 */

import java.util.Scanner;

public class findMostEfficientFunction {
	
	public static void main (String args []) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a value for computation: ");
		double n = input.nextDouble();
		input.close();
		
		double a,		//n lg n
		       b,		//n * 2^n
		       c,		//n^3
		       d,		//ln n
		       e;		//e^n
		
		a = n * (Math.log10(n)/Math.log10(2));
		b = n * Math.pow(2, n);
		c = Math.pow(n, 3);
		d = Math.log(n);
		e = Math.pow(Math.E, n);
		
		System.out.println("\n" + "n lg n = " + a);
		System.out.println("n * 2^n = " + b);
		System.out.println("n^3 = " + c);
		System.out.println("ln n = " + d);
		System.out.println("e^n = " + e + "\n");

		findMostefficient (a,b,c,d,e);
		
	}
	
	/*
	 * This method accepts five double parameters.
	 * It takes the 5 parameters and stores it in an array and finds the position within the array 
	 * that contains the most efficient function (lowest value array element).
	 * It then takes the position and pass it into the the printResult method.
	 */
	
	public static void findMostefficient (double nlgn, double n2n, double n3, double lnn, double en) {
		double arr[] = {nlgn, n2n, n3, lnn, en};
		double temp=arr[0];
		int location=0;
		
		for (int i = 1; i < 5; i ++){
			if (temp > arr[i]) {
				temp = arr[i];
				location = i;
			}
		}
		printResult(location);
	}
	
	/*
	 * This method accepts an int parameter. 
	 * It prints the most efficient function to the screen.
	 */
	
	public static void printResult (int l) {		
		if (l==0)
			System.out.println(" n lg n is the most efficient function!");
		else if (l==1)
			System.out.println("n * 2^n is the most efficient function!");
		else if (l==2)
			System.out.println("n^3 is the most efficient function!");
		else if (l==3)
			System.out.println("ln n is the most efficient function!");
		else
			System.out.println("e^n is the most efficient function!");
	}
	
}
