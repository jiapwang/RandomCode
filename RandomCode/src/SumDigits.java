//Find the sum of the digits that make up a number

public class SumDigits {
	public static void main(String args[]) {
		int num = 1469, sum = 0; 
		
		while (num != 0) {
			sum += (num % 10);
			num /= 10;
		}
		
		System.out.println(sum);
	}
}
