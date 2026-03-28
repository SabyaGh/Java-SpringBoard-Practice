package iterationAssignment;
import java.util.Scanner;
public class Palindrome {
	
	public static int reverse(int num) {
		int rev = 0;
		int intermediate = 0;
		while(num>0) {
		
		intermediate = num%10;
		rev = rev*10;
		rev = rev + intermediate;
		num = num/10;
		}
		return rev;
	}
	
	public static void main(String [] arg) {
		
		
		int num =0;
		int revNum = 0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num = obj.nextInt();
		
		if(num>0) {
			revNum = reverse(num);
			if(num == revNum) {
				System.out.println(num +" is a palindrome number");
			}
			else
			{
				System.out.println(num+" is not a palindrome number");
			}
		}
		

		obj.close();
	}

}

