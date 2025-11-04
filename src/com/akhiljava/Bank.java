package com.akhiljava;

public class Bank {
	static int currentBalance = 1000;

	public static void greetCustomer() {
		System.out.println("hello, elcome to banking application");
	}

	public void depoist(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("the amount is depoisted sucessfully");

	}
	
	public void depoist2(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("again the amount depoisted sucessfully");
	}

	public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("the amount is withdrawal sucessfully");
	}

	public int getCurrentBalance() {
		return currentBalance;

	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("current blance is :" + bank.getCurrentBalance());
		bank.depoist(500);
		System.out.println("current blance is  :" +bank.getCurrentBalance());
		bank.depoist2(600);
		System.out.println("current balance : " + bank.getCurrentBalance());
		Bank.withdrawal(300);
		System.out.println("current balance : " + bank.getCurrentBalance());
		Bank.withdrawal(200);
		System.out.println("current balance : " + bank.getCurrentBalance());
	}

}
