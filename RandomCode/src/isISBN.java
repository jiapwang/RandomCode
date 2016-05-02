/*	
    To verify an ISBN you :
    	obtain the sum of 10 times the first digit, 9 times the second digit, 
        8 times the third digit... all the way till you add 1 times the last digit. 
        If the sum leaves no remainder when divided by 11 the code is a valid ISBN.
*/

public class isISBN {
	
	public static void main (String[] args)
	{
		boolean isISBN = false; 
		String data = "0-7475-3269-9"; 
		data = data.replace("-", "");
		
		isISBN = isValidISBN(data); 
		
		System.out.println(isISBN); 
	}
	
	//this method checks to see if the string passed into it is a valid ISBN number 
	//return true if valid
    //false otherwise
	public static boolean isValidISBN (String data) {
	    int sum = 0; 
	    for (int i = 0; i < data.length(); i++) {
	        sum += Integer.parseInt(data.charAt(i)+"") * (10-i); 
	    }
	    
	    if (sum % 11 == 0) {
	        return true;
	    }
	    return false;
	}
}
