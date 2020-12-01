package ddjavapackage;
import java.util.Scanner;

public class CodechefTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		
		while(true){
			num=sc.nextInt();
			if(num==42)
				break;
			System.out.println(num);
		}
		sc.close();
		
			
	}
	
}
