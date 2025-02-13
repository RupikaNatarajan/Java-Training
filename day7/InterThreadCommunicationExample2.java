package com.celcom.day7;

import java.util.Scanner;

class SavingsAccount  {
	private long balanceAmount;

	public long getBalanceAmount() {
		return balanceAmount;
	}
	
	public void deposit(long amount) {
		balanceAmount = this.balanceAmount + amount;
	}
	
	public void withdraw(long amount) {
		balanceAmount = this.balanceAmount - amount;
	}
	

//	public void setBalanceAmount(long balanceAmount) {
//		this.balanceAmount = balanceAmount;
//	}

	
}

class Withdraw extends Thread {
	SavingsAccount savingAccount;

	Withdraw(SavingsAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	
	public void run() {
		synchronized(savingAccount) {
			System.out.println("withdrawer is waiting for Depositer to deposit the money...");
			try {
				savingAccount.wait();
			} catch (InterruptedException e) {}
		}
		System.out.println("Enter the amount to withdraw");
		long amount = new Scanner(System.in).nextLong();
		if(amount <= savingAccount.getBalanceAmount()) {
			savingAccount.withdraw(amount);
			System.out.println(amount + " withdrawed Successfully");
			System.out.println("Balance : " + savingAccount.getBalanceAmount());
		}
		else {
			System.out.println("Balance amount is less than the entered amount");
			System.out.println("Balance : " + savingAccount.getBalanceAmount());
		}
	}
}

class Deposit extends Thread {
	SavingsAccount savingAccount;

	Deposit(SavingsAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	
	public void run() {
		synchronized(savingAccount) {
			System.out.println("Depositer can deposit the money");
			System.out.println("Enter the amount to Deposit");
			long amount = new Scanner(System.in).nextLong();
			savingAccount.deposit(amount);
			System.out.println(amount + " Deposited Successfully");
			System.out.println("Balance : " + savingAccount.getBalanceAmount());
			savingAccount.notify();
		}
	}
}

public class InterThreadCommunicationExample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SavingsAccount savingAccount = new SavingsAccount();
		
		Withdraw withdrawer = new Withdraw(savingAccount);
		withdrawer.start();
		
		Thread.sleep(2000);
		
		Deposit depositer = new Deposit(savingAccount);
		depositer.start();
		
		

	}

}
