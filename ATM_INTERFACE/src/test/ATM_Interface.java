package test;
import java.util.Scanner;
public class ATM_Interface 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter initial Account Balance : $");
	double initialBalance=sc.nextDouble();
	BankAccount bankAccount =new BankAccount(initialBalance);
	ATM atm=new ATM(bankAccount);
	
	while(true) 
	{
		atm.displayMenu();
		System.out.print("Select an Option: ");
		int choice=sc.nextInt();
		atm.performTransation(choice, sc);
	  }
	}
}
