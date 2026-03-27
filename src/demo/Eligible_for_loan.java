package demo;
import java.util.Scanner;
public class Eligible_for_loan {
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int acc_Number,acc_Balance,salary,exp_loan_amt,exp_n_o_EMI;
		String loanType;
		
		System.out.println("accountNumber=");
		acc_Number = sc.nextInt();// INPUT The Account Number.
		
		String numString = String.valueOf(acc_Number);//CONVERT INT TO STRING.
		int length = numString.length(); //FIND THE LENGTH OF THE STRING
		int firstDigit = Eligible_for_loan.getFirstDigit(acc_Number);//GET THE FIRST NUMBER OF THE ACCOUNT NUMBER.
		
		System.out.println("salary=");
		salary = sc.nextInt();//INPUT THE SALARY.
		
		System.out.println("accountBalance=");
		acc_Balance = sc.nextInt();//INPUT THE BALANCE OF THE CUSTOMER.
		
		System.out.println("loanType=");
		loanType = sc.nextLine();
		sc.next();//INPUT THE LOAN TYPE.
		
		System.out.println("loanAmountExpected=");
		exp_loan_amt = sc.nextInt();//ENTER EXPECTED LOAN AMOUNT.
		
		System.out.println("emisExpected=");
		exp_n_o_EMI= sc.nextInt();//EXPECTED EMI'S BY THE CUSTOMER.
				
		
		if(length == 4 && firstDigit == 1 && acc_Balance >=1000) {
			if(salary >25000 ) {
				if(exp_loan_amt <=500000 && exp_n_o_EMI <= 36) {
					System.out.println("eligibleLoanAmount= 500000");
					System.out.println("eligibleEmis= 36");
				}
			}
			if(salary > 50000) {
				if(exp_loan_amt <=6000000 && exp_n_o_EMI <=60) {
					System.out.println("eligibleLoanAmount= 6000000");
					System.out.println("eligibleEmis= 60");
				}
			}
			if(salary>75000) {
				if(exp_loan_amt <= 7500000 && exp_n_o_EMI <= 84) {
					System.out.println("eligibleLoanAmount= 7500000");
					System.out.println("eligibleEmis= 84");
				}
			}
		}
		else
			System.out.println("You Are Not Eligible for a Loan");
		
		
		sc.close();
	}
	
	public static int getFirstDigit(int number) {
	    while (number >= 10) {
	        number = number / 10;
	    }
	    return number;
	}
}
