package ddjavapackage;

import java.util.Scanner;

public class StringCompare {
	/*compare two strings and print"Strings are same" if both strings are same, else print "Strings are different".Create a method to compare strings 
	and return the result to main class*/
	
	
	
	public static void main (String[]args){
		Scanner string = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = string.nextLine();
		System.out.println("Enter the second string");
		String s2 = string.nextLine();
		CompareFunction(s1,s2);
		string.close();
	}
	private static  Object CompareFunction(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.equals(s2))
		{
		System.out.println("Strings are same");
		}
		else
		{
		System.out.println("Strings are different");
		}
		return null;
	}
}
