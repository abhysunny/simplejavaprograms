package ddjavapackage;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the number of elements entered for addtion");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[10];
    int sum = 0;
    
    for(int i=0;i<n;i++){
    System.out.println("Enter elements");
    array[i] = sc.nextInt();
    }
    for( int num : array) {
        sum = sum+num;
    }
    System.out.println("Sum of array elements is:"+sum);
    sc.close();
	}

}
