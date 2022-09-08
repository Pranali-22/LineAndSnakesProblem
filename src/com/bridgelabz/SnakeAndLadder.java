/**
 * 
 */
package com.bridgelabz;
import java.util.*;

/**
 * @author Dell
 *
 */
public class SnakeAndLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int position1=0, position2=0;	
		
		System.out.println("Starting position is "+position1);
		
		//Code to get random die number
		Random r=new Random();
		//int roll=r.nextInt(6)+1;
		int roll1, roll2;
		//System.out.println("number on die : "+roll);
		
		//code to check for option
		int count=0, turn=0;
		while(position1<100 && position2<100) {
			if(turn%2==0) {
				turn++;
				roll1=r.nextInt(6)+1;
				System.out.println("number on die : "+roll1);
				int option=r.nextInt(3);
				count++;
				switch (option) {
					case 0:
						System.out.println("No Play");
						break;
						
					case 1:
						System.out.println("Got ladder");
						if(position1+roll1 <=100) {
							position1 = position1+roll1;
						}
						break;
						
					case 2:
						System.out.println("Got snake");
						if(position1!=0 && position1-roll1>=0 ) {
							position1 = position1-roll1;
						}
						else {
							position1=0;
						}
						break;
						
					default :
						System.out.println("Incorrect  option");
						break;
				}
				System.out.println("current position is "+position1);
			}
			else {
				turn++;
				roll2=r.nextInt(6)+1;
				System.out.println("number on die : "+roll2);
				int option=r.nextInt(3);
				count++;
				switch (option) {
					case 0:
						System.out.println("No Play");
						break;
						
					case 1:
						System.out.println("Got ladder");
						if(position2+roll2 <=100) {
							position2 = position2+roll2;
						}
						break;
						
					case 2:
						System.out.println("Got snake");
						if(position2!=0 && position2-roll2>=0 ) {
							position2 = position2-roll2;
						}
						else {
							position2=0;
						}
						break;
						
					default :
						System.out.println("Incorrect  option");
						break;
				}
				System.out.println("current position is "+position2);
			}
		}
		
		//System.out.println("Number of times dice was played = "+count);
		if(position1==100) {
			System.out.println("First player won the game");
		}
		else {
			System.out.println("Second player won the game");
		}
		
	}

}
