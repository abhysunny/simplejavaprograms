package ddjavapackage;

import java.util.Scanner;

/*
This is Java Program to convert a decimal no: to binary
Author: Abhy Sunny
Date: 02/11/2018 mm/dd//yyyy
 */

public class DecimalToBinary {

	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the decimal no: to be coverted to binary?");
	int decimal = sc.nextInt();
	
	int binary [] = new int[20];
	int index = 0;
	
	
	
	while(decimal > 0) {
		
		int reminader = decimal%2;
		binary[index++] = reminader;
		decimal = decimal/2;	
	}
	
	System.out.print("Binary for" + decimal + "is:");
	for(int i=index;i>=0;i--) {
			System.out.print(binary[i]);
			
	}

	sc.close();
	}

}
