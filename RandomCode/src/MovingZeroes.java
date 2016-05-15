//https://leetcode.com/problems/move-zeroes/

//Given an array nums, write a function to move all 0's to the end 
//of it while maintaining the relative order of the non-zero elements. 


public class MovingZeroes {
	public static void main (String args[]) {
		int nums[] = {2,5,0,2,1,0,7,8};
		printArr(nums);
		moveZeroes(nums);
	}
	
	//this method moves all the Zeroes to the end of the array while maintaining
	//the relative order of the non-zero elements. 
	public static void moveZeroes(int [] nums) {
		int count = 0; 	
		
		//this for-loop counts the number of zeroes in the nums array
		for (int i = 0; i < nums.length; i ++) {
			if (nums[i] == 0) 
				count ++;
		}
		
		//for each zero in the nums array, bubble the zeroes to the end of the array
		for (int c = 0; c < count; c++) {
			for (int i = 0; i < nums.length -1; i++) {
				if (nums[i] == 0) {		//if a zero is found, swap the zero with it's higher-index neighbor. Do it until the zero is at the end of the array.
					nums[i]= nums[i+1]; 
					nums[i+1] = 0;
				}
			}
		}
		
		printArr(nums);
	}
	
	//this method prints the contents of the array
	public static void printArr(int [] num){
		for (int i =0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("");
	}
	
}
