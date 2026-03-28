package iterationAssignment;
import java.util.Scanner;
public class DivisableBySumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		int number = num;
		int sumOfDigits = DivisableBySumOfDigits.sumTheD(num);
		
		if(number%sumOfDigits == 0) {
			System.out.println(number+" is divisable by sum of its digits");
		}
		else {
			System.out.println(number+" is not divisable by sum of its digits");
		}
		
		sc.close();
	}
	
	public static int sumTheD(int num) {
		int intermediate = 0;
		int sum = 0;
		while(num>0) {
			intermediate = num%10;
			sum = sum + intermediate;
			num = num/10;
		}
		return sum;
	}

}
