package ddjavapackage;

import java.util.Scanner;

public class SimpleScanner {

	//Main Method
	public static void main(String[] args) {

		//Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No: of times to be printed");
		int t=sc.nextInt();
		System.out.println("Name to be printed");
		String n=sc.next();
		
		while(t>0){
			System.out.println(n);
			t--;
		}
		
		sc.close();
	}

}
