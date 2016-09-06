package ddjavapackage;

import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {
    //Program to print an array of numbers
	System.out.println("Enter the no: of elements to be printed");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(); 
	
	int[] array = new int[10];
	
	for(int i=0;i<n;i++){
	System.out.println("Enter element");
	array[i] = sc.nextInt();	
	}
	System.out.println("The array of numbers stored are:");
	for(int i=0;i<n;i++){
	System.out.println(array[i]);
	}
	sc.close();
	}

}
