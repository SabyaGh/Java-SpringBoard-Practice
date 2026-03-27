package demo;
import java.util.Scanner;
public class Change_match {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		// 
		int note_of_five = 0;
		int note_of_one = 0;
		int purchase_amount = 0;
		
		
		
		System.out.println("$1 notes avaiable=");
		note_of_one=sc.nextInt();
		System.out.println("5$ notes availble=");
		note_of_five = sc.nextInt();
		
		System.out.println("Purchase Amount =");
		purchase_amount = sc.nextInt();
		
		int totalNoOfNote = note_of_one+note_of_five;
		int total_money = (note_of_five*5)+note_of_one;
		
		if(purchase_amount > total_money) {
			System.out.println("-1");
		}
		else {
			int five_note_required = purchase_amount/5;
			int oneNoteRequired = (purchase_amount%5);
			System.out.println("$1 notes needed="+oneNoteRequired);
			System.out.println("$5 note required="+five_note_required);
			
		}
		
		sc.close();
	}

}
