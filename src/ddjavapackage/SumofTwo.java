package ddjavapackage;
import java.util.Scanner;

public class SumofTwo {
	
	public static void main(String[]Args){
		
		
		
		int num1,num2,sum;
		
		System.out.println("Enter first no");
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		
		System.out.println("Enter second no");
		
		num2 = sc.nextInt();
		
		sc.close();
		
		sum = num1+num2;
		
		System.out.println("Sum is: "+sum);
		
		
		
	}

}
