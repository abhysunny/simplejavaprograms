package ddjavapackage;

import java.util.Scanner;

public class StringReversal { 
	
	public static void main(String[]args){
	
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		String r = "";
		
		int length = d.length();
		
		for(int i = length - 1; i >= 0; i--){
			r = r + d.charAt(i);
		}
		System.out.println(r);
		sc.close();
	}
	
}
