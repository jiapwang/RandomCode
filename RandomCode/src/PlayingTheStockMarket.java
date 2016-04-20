/* 
Let's assume I'm playing the stock market - buy low, sell high. I'm a day trader, 
so I want to get in and out of a stock before the day is done, and I want to time 
my trades so that I make the biggest gain possible. 

The market has a rule that won't let me buy and sell in a pair of ticks - I have to 
wait for at least one tick to go by. 

o, given a list of stock price ticks for the day, can you tell me what trades I should 
make to maximize my gain within the constraints of the market? Remember - buy low, sell 
high, and you can't sell before you buy.
*/

public class PlayingTheStockMarket {
	public static void main (String[] args) { 
		String data = "9.20 8.03 10.02 8.08 8.14 8.10 8.31 8.28 8.35 8.34 8.39 8.45 8.38 8.38 8.32 8.36 8.28 8.28 8.38 8.48 8.49 8.54 8.73 8.72 8.76 8.74 8.87 8.82 8.81 8.82 8.85 8.85 8.86 8.63 8.70 8.68 8.72 8.77 8.69 8.65 8.70 8.98 8.98 8.87 8.71 9.17 9.34 9.28 8.98 9.02 9.16 9.15 9.07 9.14 9.13 9.10 9.16 9.06 9.10 9.15 9.11 8.72 8.86 8.83 8.70 8.69 8.73 8.73 8.67 8.70 8.69 8.81 8.82 8.83 8.91 8.80 8.97 8.86 8.81 8.87 8.82 8.78 8.82 8.77 8.54 8.32 8.33 8.32 8.51 8.53 8.52 8.41 8.55 8.31 8.38 8.34 8.34 8.19 8.17 8.16"; 
        String [] dataArray = data.split(" "); 
        float [] array = new float [dataArray.length]; 
        
        for (int i = 0; i < dataArray.length; i++) { 
        	array[i] = Float.parseFloat(dataArray[i]); 
        } 
        int min = findMin(array); 
        int max = findMax (array, min);  
        
        System.out.print("Buy: " + array[min] + "\n" + "Sell: " + array[max]);  
        
        return; 
    } 
    
	//this method finds and returns the index of the min of the stocks
	public static int findMin (float array[]) { 
		int minIndex = 0;  
		for (int i = 1; i < array.length; i++) { 
			if (array[i] < array[minIndex]) { 
				minIndex = i; 
            } 
		} 
		return minIndex; 
    } 
    
	//this method finds and returns the index of the max of the stock that occurs after the min
	public static int findMax (float array[], int min) { 
		int maxIndex = min + 2; 
		for (int i = maxIndex; i < array.length; i++) { 
			if (array[i] > array[maxIndex]) { 
				maxIndex = i; 
            } 
		} 
		return maxIndex; 
    } 

}