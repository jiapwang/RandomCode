/*
https://www.youtube.com/watch?v=N5vJSNXPEwA - explanation of the approach to solving the riddle

The game goes as following:

    1) You put a group of n people in one row, each facing the same direction
    2) You assign a colored hat to each person of the group
    3) Now you let each person guess the color of their own hat, starting with 
       the last person in the row.

There are only 2 colors of hats and each person can only see the color of hats in front 
of them. The group wins if they can win by making only 1 mistake.

The person guessing can only see the persons in front of them (and their hats) and can 
hear the guesses from the persons behind them. They can NEVER look behind them or look 
at their own hat.
*/


public class GuessMyHatColor {

	public static void main (String[] args) { 
		String data = "Black White Black Black White White Black White White White White Black";  
        String [] dataArray = data.split(" "); 
        boolean even = DoYouEven(dataArray, 0);  
        
        for (int i = 0; i < dataArray.length; i++) { 
        	if ( i == 0 && DoYouEven(dataArray,i) == false)  
        		System.out.print("Black, "); 
        	else if ( i == 0 && DoYouEven(dataArray,i) == true)  
        		System.out.print("White, "); 
            else if ((DoYouEven(dataArray,i) == true && even == true) || (DoYouEven(dataArray,i) == false && even == false)) 
                System.out.print("White, "); 
            else { 
                System.out.print("Black, "); 
                even = !even; 
            } 
        } 
    } 
     
	
	//this method goes through the array and checks how many elements after index i is equal to the String "Black"
	//return false if odd number of Black hats  
    //return true if even number of Black hats 
    public static boolean DoYouEven (String [] dataArray, int x) { 
    	int count = 0; 
    	for (int i = x+1; i < dataArray.length; i ++) { 
    		if (dataArray[i].equals("Black")) 
    			count ++;  
    	} 
        
    	if (count % 2 == 0)  
    		return true;  
        else  
        	return false; 
    } 
 
}
