//Google Code Jam 2011
//Problem A. Bot Trust
//https://code.google.com/codejam/contest/975485/dashboard

public class Robot {
	private String color; 	//robot color
	private int pos; 		//robot position
	
	//if c holds the value 'O' then set color equal to "Orange" and set robot position to 1
	//else set color equal to "Blue" and set robot position to 1
	public Robot (char c) {
		if (c == 'O') {
			color = "Orange";
			pos = 1;
		}
		else {
			color = "Blue"; 
			pos = 1;
		}
	}
	
	//if c holds the value 'O' then set color equal to "Orange" and set robot position to p
	//else set color equal to "Blue" and set robot position to p
	public Robot(char c, int p) {
		if (c == 'O') {
			color = "Orange";
			pos = p;
		}
		else {
			color = "Blue"; 
			pos = p;
		}
	}
	
	//return color of robot as String
	public String getColor() {
		return color;
	}
	
	//return position of robot as integer
	public int getPos() {
		return pos;
	}
	
	//increase position of robot by 1 and print out current position
	public void moveRight() {
		pos++;
		System.out.print(color + " move to button " + pos);
	}
	
	//decrease position of robot by 1 and print out current position
	public void moveLeft() {
		pos--;
		System.out.print(color + " move to button " + pos);
	}
	
	//print out stay at current position
	public void dontMove() {
		System.out.print(color + " stay at button " + pos);
	}
	
	//print out push button at current position
	public void pushButton() {
		System.out.print(color + " push button " + pos);
	}
	
}
