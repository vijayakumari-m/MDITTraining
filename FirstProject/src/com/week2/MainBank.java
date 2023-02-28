package com.week2;

public class MainBank {

	public static void main(String[] args) {
		
		MasterBank masterBankManager = new MasterBank();
		BankA bankAManager = new BankA();
		BankB bankBManager = new BankB();
		BankC bankCManager = new BankC();
		
		System.out.println("MasterBank- "+masterBankManager.setInterestRate(0));
		System.out.println("BankA- "+bankAManager.setInterestRate(8));
		System.out.println("BankB- "+bankBManager.setInterestRate(9));
		System.out.println("BankC- "+bankCManager.setInterestRate(10));

	}

}
