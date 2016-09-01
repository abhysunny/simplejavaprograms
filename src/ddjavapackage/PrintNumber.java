package ddjavapackage;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// To generate odd numbers
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of odd numbers to be printed");	
	int n = sc.nextInt();
	
	for(int i=1;n>0;n--){
	
	System.out.println(i);
	i=i+2;
	}
	sc.close();
	}
	
}
