package demo;
import java.util.Scanner;
public class fact {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		int number = n;
		int f = 1;
		if(n==0) {
			f = 1;
		}
		else
		{
			while (n!=0) {
				f=f*n;
				n=n-1;
			}
		}
		System.out.println("Factorial of "+number+" is: "+f);
		sc.close();
	}

}
