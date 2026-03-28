package iterationAssignment;
import java.util.Scanner;
import java.math.*;
public class armstrong {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		int numberofDigits = armstrong.countDigits(num);
		
		armstrongOrNot(num,numberofDigits);
		
		sc.close();
	}
	public static int countDigits(int num) {
		int count = 0;
		
		while(num>0) {
		count = count +1;
		num = num/10;
		}
		return count;
	}
	
	public static void armstrongOrNot(int number,int digits) {
		boolean solution = false;
		int result = number;
		double num2 = 0;
		int intermediate = 0;
		
		for(int i = number; i>0; i = i/10){
			intermediate = i%10;
			num2 += Math.pow(intermediate, digits);
			
			if(num2 == result) {
				System.out.println(result+" is a armstrong number");
				solution = true;
				break;
			}
		}
		if (!solution) {
			System.out.println(result+" is not a armstrong number");
		}
	}

}
