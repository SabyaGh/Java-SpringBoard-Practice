package demo;
import java.util.Scanner;
public class Bill_to_be_paid {
	static int deliveryCharges(int distance) {
		int charges;
		if(distance<=3) {
			charges = 0;
		}
		else if (distance<=6 && distance >3) {
			charges = (distance-3)*1;
		}
		else 
			charges = ((distance - 6)*2)+3;
		
		return charges;
	}
	
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		char foodType = 'V';
		int nonVegPrice = 15;
		int vegPrice = 12;
		int quantity = 0;
		int distance = 0;
		int extraCharges = 1;
		int foodPrice = 0;
		int totalPrice =1;
		
		System.out.println("Enter Type of food you want to order 'V' for Veg plate & 'N' for Non-Veg plate:");
		foodType = sc.nextLine().charAt(0);
		
		//If the order is for Veg Plate.
		
		if(foodType == 'V') {
			
			System.out.println("Enter the number of Items wants to order :");
			quantity = sc.nextInt();
			if(quantity>=1) {
				foodPrice = vegPrice*quantity;
			}
			else {
				System.out.println("At least one item needed");
			}
			
			
			
			System.out.println("Enter the Distance of your house from the resturant");
			distance = sc.nextInt();
			if(distance>0) {
				extraCharges = Bill_to_be_paid.deliveryCharges(distance);
			}
			else {
				System.out.println("Distance must be Greater than 0");
			}
			
			totalPrice = foodPrice+extraCharges;
			System.out.println("Food Item:"+quantity);
			System.out.println("Distance:"+ distance);
			System.out.println("Totat Bill to be paid:"+totalPrice);
			System.out.println("Order placed Succesfully, we will reach soon at your doorstep...");			
		}
		
		
		//if the order is for Non_Veg Plate.
		
		else if (foodType == 'N') {
			
			System.out.println("Enter the number of Items wants to order :");
			quantity = sc.nextInt();
			if(quantity>=1) {
				foodPrice = nonVegPrice*quantity;
			}
			else {
				System.out.println("At least one item needed");
			}
			
			
			
			System.out.println("Enter the Distance of your house from the resturant");
			distance = sc.nextInt();
			if(distance>0) {
				extraCharges = Bill_to_be_paid.deliveryCharges(distance);
			}
			else {
				System.out.println("Distance must be Greater than 0");
			}
			
			totalPrice = foodPrice+extraCharges;
			System.out.println("Food Item:"+quantity);
			System.out.println("Distance:"+ distance);
			System.out.println("Totat Bill to be paid:"+totalPrice);
			System.out.println("Order placed Succesfully, we will reach soon at your doorstep...");	
		}
		
		sc.close();
	}

}
