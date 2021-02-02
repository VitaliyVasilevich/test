package by.htp.test.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import by.htp.test.bean.Account;

public class ClientLogic {

	public List<Account> searchByAccountNumber(List<Account> clientAccounts, String number) {
		List<Account> result = new ArrayList<>();
		for (Account currentAccount : clientAccounts) {
			String currentAccountNumber = currentAccount.getAccountNumber();
			if (currentAccountNumber.equals(number)) {
				result.add(currentAccount);
			}
		}
		return result;
	}

	public List<Account> sortByBalance(List<Account> clientAccounts) {
		List<Account> accounts = new ArrayList<>();
		accounts.addAll(clientAccounts);
		for (int i = 0; i < accounts.size(); i++) {
			for (int j = 0; j < accounts.size() - 1; j++) {
				Account a1 = accounts.get(j);
				Account a2 = accounts.get(j + 1);
				if (a1.getBalance() > a2.getBalance()) {
					Collections.swap(accounts, j, j + 1);
				}
			}
		}
		return accounts;
	}

	public int sumPositiveBalance(List<Account> accounts) {
		int result = 0;
		for (int i = 0; i < accounts.size(); i++) {
			int temp = accounts.get(i).getBalance();
			if (temp > 0) {
				result += temp;
			}
		}

		return result;

	}

	public int credit(List<Account> accounts) {
		int result = 0;
		for (int i = 0; i < accounts.size(); i++) {
			int temp = accounts.get(i).getBalance();
			if (temp < 0) {
				result += temp;
			}
		}

		return result;
	}
}