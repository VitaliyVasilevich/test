package by.htp.test.view;

import java.util.List;

import by.htp.test.bean.Account;

public class ClientView {
	public void print(String message, List<Account> accounts) {
		System.out.println(message);
		for (Account account : accounts) {
			System.out.println("accountNumber: " + account.getAccountNumber());
			System.out.println("balance: " + account.getBalance() + account.getCurrency());
			System.out.println("validity: " + account.getValidity());
			System.out.println("blocked: " + account.isBlocked());
			System.out.println("----------------------------------");

		}
	}

}
