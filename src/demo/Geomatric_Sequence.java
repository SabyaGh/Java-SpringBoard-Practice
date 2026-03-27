package demo;
import java.util.Scanner;
public class Geomatric_Sequence {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of sequence wants:");
		int seq = sc.nextInt();
		int num = 1;
		if(seq ==0) {
			System.out.println("Enter a number > 0");
		}
		else {
			while(seq>0) {
				System.out.println(num);
				num = num *2;
				seq = seq-1; 
				}
			}
		sc.close();
	}
}
