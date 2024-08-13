package test;
import java.util.Scanner;
public class ATM 
{
	private BankAccount bankAccount;
	public ATM(BankAccount bankAccount) {
		this.bankAccount=bankAccount;
	}
	public void displayMenu() {
		System.out.println("ATM Menu");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
	}
	public void performTransation(int choice, Scanner sc) 
	{
		switch(choice) {
		case 1:
			System.out.println("Current balance: $"+bankAccount.getBalance());
			break;
		case 2:
			System.out.println("Enter Deposit Amount: $");
			double depositAmount=sc.nextDouble();
			bankAccount.deposit(depositAmount);
			break;
		case 3:
			System.out.println("Enter Withdrawal Amount: $");
			double withdrawalAmount=sc.nextDouble();
			bankAccount.deposit(withdrawalAmount);
			break;
		case 4:
			System.out.println("Exiting ATM.Thank you!");
			sc.close();
			System.exit(0);
			default:
				System.out.println("Invalid choice. Please Select a Valid Option");
			
		}
	}
}
