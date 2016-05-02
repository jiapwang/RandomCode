//Google Code Jam 2011
//Problem A. Bot Trust
//https://code.google.com/codejam/contest/975485/dashboard

import java.lang.*;
import java.util.Scanner;
import java.util.LinkedList;

public class RobotTrust {
	public static void main (String Args[]) {
		
		LinkedList<Robot> lst = new LinkedList<Robot>();
		
		lst.add(new Robot('O', 2));
		lst.add(new Robot('B', 1)); 
		lst.add(new Robot('B', 2)); 
		lst.add(new Robot('O', 4)); 
		
		Robot Robot1 = new Robot ('O'); 
		Robot Robot2 = new Robot ('B'); 
		
		//System.out.println(lst.get(0).getColor() + " " + lst.get(0).getPos());
		//lst.pop(); 
		//System.out.println(lst.get(0).getColor() + " " + lst.get(0).getPos());
		
		
		while (!lst.isEmpty()) {
			if (lst.get(0).getColor() == Robot1.getColor()) {
				doWhat(Robot1,lst,0);
			}
				else{ 
					doWhat(Robot2,lst,0);
				}
			
			System.out.print("  ||  ");
			
			
			if (lst.size() >= 2 && lst.get(0).getColor() == Robot2.getColor()) {
				doWhat(Robot2,lst,1);
			}
				else if (lst.size() > 2 && lst.get(1).getColor() == Robot1.getColor()){ 
					doWhat(Robot1,lst,1);
				}
			
			System.out.println("");
		}
		
		
	}
	
	public static void doWhat (Robot Robo, LinkedList<Robot> lst, int i) {
		if (Robo.getPos() != lst.get(i).getPos()) {
			if (lst.get(i).getPos() > Robo.getPos())
				Robo.moveRight();
			else if (lst.get(i).getPos() < Robo.getPos())
				Robo.moveLeft();
			else if (lst.get(0).getColor() != Robo.getColor())
				Robo.dontMove(); 
			}
		
			else if ((Robo.getColor() == lst.get(i).getColor()) && (Robo.getPos() == lst.get(i).getPos())) {
				Robo.pushButton();
				lst.pop();
			}	
	}
	
}
