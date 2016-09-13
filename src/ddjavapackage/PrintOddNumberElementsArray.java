package ddjavapackage;

import java.util.Scanner;

public class PrintOddNumberElementsArray {
	
	public static void main(String[]args){
		System.out.println("Enter the number of integers that you are planning to enter");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[]array= new int[a];
		
		System.out.println("Enter the numbers");
		for(int i=0;i<a;i++){
			array[i] = sc.nextInt();
		}
		
		System.out.print("Odd numbers are:");	
		for(int j=0;j<a;j++){
			if(array[j] % 2 ==1){
				System.out.print(array[j]+",");
			}
				
		}
		sc.close();
		
	}
}
