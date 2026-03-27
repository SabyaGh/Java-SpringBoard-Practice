package demo;
import java.util.Scanner;
public class multipleOf_three_five {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER :");
		int num = sc.nextInt();
		
		if(num%3 == 0 && num%5 != 0) {
			System.out.print("zip");
		}
		else if(num%5 == 0 && num%3!=0) {
			System.out.print("zap");		}
		else if(num%3 == 0 && num%5 == 0) {
			System.out.print("zoom");
		}
		else {
			System.out.print("Invalid");
		}
		sc.close();
	}

}
