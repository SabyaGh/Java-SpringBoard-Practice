package demo;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		int product=1;
		System.out.print("Entera Three numbers :");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1==7 && n2==7 &&n3==7) {
			System.out.println("Only one value could be 7");
		}
		if(n1!=7 && n2!=7 && n3!=7) {
			product = n1*n2*n3;
		}
		else if (n1!=7 && n2==7 && n3!=7) {
			product = n3;
		}
		else if(n1==7 && n2!=7 && n3!=7) {
			product = n2*n3;
		}
		else if(n1!=7 && n2!=7 && n3==7) {
			product = -1;
		}
		System.out.println(product);
		
		sc.close();
	}

}
