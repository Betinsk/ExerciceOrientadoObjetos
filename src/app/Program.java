package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		System.out.print("is there na initial deposit (y/n): ");
		char c = sc.next().charAt(0);	
		
		if(c =='y') {
			System.out.println("Enter initial deposit value: ");
			double intialDeposit = sc.nextDouble();
			account = new Account(accountNumber, holderName, intialDeposit);
			System.out.println("Account data: ");
			System.out.println("Account "+ account);
		}
		
		else {
			account = new Account(accountNumber, holderName);
			System.out.println("Account data: ");
			System.out.println(account);
		}
		System.out.println();
		System.out.printf("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println("Update account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.printf("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		
		
		
		sc.close();

	}

}
