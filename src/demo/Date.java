package demo;
import java.util.Scanner;
public class Date {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = 0;
		int month = 0;
		int year = 0;
		
		System.out.println("Day=");
		day = sc.nextInt();
		System.out.println("Month=");
		month = sc.nextInt();
		System.out.print("year=");
		year = sc.nextInt();
		
		
		
		if(day>0 && month >0 && month<=12) {
			if(year >=0 )
			{
				year += 2000;
				System.out.print((day+1)+"-"+month+"-"+year);
				
			}
		}
		else {
			System.out.print("Enter a Valid date");
		}
		
		sc.close();
	}

}
