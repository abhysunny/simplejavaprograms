package ddjavapackage;

import java.util.Scanner;
import java.util.Arrays;


public class SortArray {
	
	//Sort elements in an array in descending order - Integer
	public static void main(String[] args){
		
	System.out.println("Enter the num of elements in Array");
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	int [] array = new int[num];
	
	for(int i=0; i<num; i++){
		array[i] = sc.nextInt();
	}
	
	Arrays.sort(array);
	
	System.out.println("The sorted array is");
	
	for(int arraynum : array )
		System.out.println(arraynum);	
	
	sc.close();
	}
	
	}


