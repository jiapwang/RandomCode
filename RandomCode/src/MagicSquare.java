/*
A 3x3 magic square is a 3x3 grid of the numbers 1-9 such that each row, column, and major diagonal adds up to 15. Here's an example:

8 1 6
3 5 7
4 9 2

2 7 6 
9 5 1 
4 3 8

Write a program that, given a grid containing the numbers 1-9, determines whether it's a magic square.
*/


public class MagicSquare {
	public static void main (String args[]) {
		int [][] arr = new int [3][3]; 
		arr[0][0] = 8;
		arr[0][1] = 1;
		arr[0][2] = 6;
		arr[1][0] = 3;
		arr[1][1] = 5;
		arr[1][2] = 7;
		arr[2][0] = 4;
		arr[2][1] = 9;
		arr[2][2] = 2;
		
		print2D(arr);
		isMagic(arr);
	}
	
	// this method prints the 2D array
	static void print2D (int [][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr.length; column++)
				System.out.print(arr[row][column] + " ");
			System.out.println("\n");
		}
	}
	
	//check if the 2D array is a magic square
	static void isMagic (int [][] arr) {
		boolean isMagic=true;
		
		if (isMagicRowsNColumn(arr) == false || isMagicDiagonal(arr) == false)
			isMagic = false;
		
		if (isMagic == false)
			System.out.println("Is not Magic Square!!!");
			else 
				System.out.println("Is Magic Square!!!");	
	}
	
	//check to see if each of the rows and column add up to 15
	//if it does, return false.
	//return true otherwise
	static boolean isMagicRowsNColumn (int[][] arr) {
		for (int row = 0; row < 3; row++) {
			int rowSum = 0, columnSum = 0;
			for (int column=0; column < 3; column ++) {
				rowSum += arr[row][column];	//
				columnSum += arr[column][row]; //sum of each column
			}
			if (rowSum != 15 || columnSum != 15)
				return false;
		}
		return true;
	}	
	
	//check to see if each of the two diagonals add up to 15
	//if not, return false
	//return true otherwise
	static boolean isMagicDiagonal (int[][] arr) {
		if (arr[0][0] + arr[1][1] + arr[2][2] != 15 && arr[0][2] + arr[1][1] + arr[2][0] != 15)
			return false;  
		return true;
	}
	
}
