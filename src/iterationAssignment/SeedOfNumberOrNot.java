package iterationAssignment;
import java.util.Scanner;
public class SeedOfNumberOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		
		findSeedorNot(num1,num2);
		sc.close();
	}
	
	public static void findSeedorNot(int num1,int num2) {
		boolean solution = false;
		int result =num1;
		
		for(int i = num1;i>0;i=i/10 ) {
			
			int intermediate = i%10;
			result = result*intermediate;
			
			if(result == num2) {
				System.out.println(num1+" is a seed of "+num2);
				solution = true;
				break;
			}
			
		}
		if(!solution) {
			System.out.println(num1+" is not a seed of "+num2);
		}
		
		
	}

}
