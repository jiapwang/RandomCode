//Google Code Jam 2011
//Problem A. Bot Trust
//https://code.google.com/codejam/contest/975485/dashboard

import java.util.ArrayList;

public class RobotTrust {
	
	static ArrayList<String> botlst = new ArrayList<String>();
	static ArrayList<Integer> buttonlst = new ArrayList<Integer>();
	
	public static void main (String Args[]) {
		
		int time = 0;
		
		botlst.add("B");
		buttonlst.add(2);
		botlst.add("B");
		buttonlst.add(1);
		//botlst.add("B");
		//buttonlst.add(100);
		//botlst.add("O");
		//buttonlst.add(4);
		
		Robot OrangeRobo = new Robot ('O'); 
		Robot BlueRobo = new Robot ('B'); 
		
		while (!botlst.isEmpty()) {
			time++;
			System.out.print(time + " | ");
			executeSequence(OrangeRobo, BlueRobo);
		}
	}
	
	public static void executeSequence (Robot OrangeRobo, Robot BlueRobo) {
		boolean btnPressed = false;
		int positionInQueue;
		int button;
		
		if (botlst.indexOf("O") != -1) {
			positionInQueue = botlst.indexOf("O");
			button = (int) buttonlst.get(positionInQueue);
		
			if (OrangeRobo.getPos() == button && positionInQueue == 0) {
				OrangeRobo.pushButton();
				btnPressed = true;
			}
				else if (OrangeRobo.getPos() < button){
					OrangeRobo.moveRight();
				}
				else if (OrangeRobo.getPos() > button) {
					OrangeRobo.moveLeft();
				}
				else {
					OrangeRobo.dontMove();
				}
		}
		else {
			OrangeRobo.dontMove();
		}
		
			System.out.print(" | ");
		
		if (botlst.indexOf("B") != -1) {
			positionInQueue = botlst.indexOf("B");
			button = (int) buttonlst.get(positionInQueue);
			
			if (BlueRobo.getPos() == button && positionInQueue == 0) {
				BlueRobo.pushButton();
				btnPressed = true;
			}
				else if (BlueRobo.getPos() < button){
					BlueRobo.moveRight();
				}
				else if (BlueRobo.getPos() > button) {
					BlueRobo.moveLeft();
				}
				else {
					BlueRobo.dontMove();
				}
		}
		else {
			BlueRobo.dontMove();
		}
		
		System.out.println();
		
		if (btnPressed) {
			botlst.remove(0);
			buttonlst.remove(0);
		}
	}
	
}
