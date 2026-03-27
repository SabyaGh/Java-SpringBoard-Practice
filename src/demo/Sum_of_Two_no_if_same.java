package demo;
import java.util.Scanner;
public class Sum_of_Two_no_if_same {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int sum = 0;
		System.out.println("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1==num2) {
			sum = num1+num2;
		}
		else
		{
			sum = 2*(num1+num2);
		}
		System.out.println(sum);
		sc.close();
	}
}
