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

	}

}
