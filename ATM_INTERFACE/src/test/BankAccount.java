package test;
public class BankAccount
{
	private double balance;
	public BankAccount(double initialBalance) 
	{
		this.balance=initialBalance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount) 
	{
		if(amount>0) 
		{
		balance+=amount;
		System.out.println("Deposit of $"+amount +"Successful.current balance: $"+balance);
		}
		else
		{
			System.out.println("Invalid deposit amount.");
		}
	}
	public void withdraw(double amount) 
	{
		if(amount>0 && amount <=balance) 
		{
			balance -=amount;
			System.out.println("Withdrawal of $"+amount +"Successful.current Balance: $"+balance);
		}
		else
		{
			System.out.println("Invalid withdrawal amount or Insufficient Balance.");
		  }	
		}
	}
