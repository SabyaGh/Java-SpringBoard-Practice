package iterationAssignment;
import java.util.Scanner;
public class Chiken_rabbits {
	
	public static void findChikenRabbits(int heads,int legs) {
		
		boolean solution = false;
		
		for (int r =0; r<=heads; r++) {
			int chik = heads - r;
			
			if(r*4 + chik*2 == legs) {
				System.out.println("chiken="+chik);
				System.out.println("rabbits="+r);
				solution = true;
				break;
			}
			
		}
		if (!solution)
		{
			System.out.println("The number of chiken & rabbits can not be found");
		}
	}
	
	
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int heads = 0;
		int legs = 0;
		
		System.out.println("Number of Heads=");
		heads = sc.nextInt();
		System.out.println("Number of Legs=");
		legs = sc.nextInt();
		findChikenRabbits(heads,legs);
		
		sc.close();
	}

}
