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
		int position=0;	
		
		System.out.println("Starting position is "+position);
		
		//Code to get random die number
		Random r=new Random();
		int roll=r.nextInt(6)+1;
		System.out.println("number on die : "+roll);
		
		//code to check for option
		int option=r.nextInt(3);
		switch (option) {
			case 0:
				System.out.println("No Play");
				break;
				
			case 1:
				System.out.println("Got ladder");
				if(position+roll <=100) {
					position = position+roll;
				}
				break;
				
			case 2:
				System.out.println("Got snake");
				if(position!=0 && position-roll>=0 ) {
					position = position-roll;
				}
				else {
					position=0;
				}
				break;
				
			default :
				System.out.println("Incorrect  option");
				break;
		}

		System.out.println("current position is "+position);
	}

}
