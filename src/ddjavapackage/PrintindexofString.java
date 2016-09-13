package ddjavapackage;

import java.util.Scanner;

public class PrintindexofString {

	//print index of a particular element in a string
	
	public static void main (String[]agrs){
		System.out.println("Enter the String value");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("Enter element  for which you have to find index ");
	    String index = sc.nextLine();
	    
	    System.out.println("Index of " +index +" in " +word +"is:"+ word.indexOf(index));
		
	    sc.close();
	}
		
}
