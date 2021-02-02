package by.htp.test.main;

import java.util.List;
import by.htp.test.bean.Account;
import by.htp.test.bean.Client;
import by.htp.test.service.ClientLogic;
import by.htp.test.view.ClientView;

public class Main {

	public static void main(String[] args) {
		ClientLogic clientLogic = new ClientLogic();
		Client client = new Client();
		ClientView view = new ClientView();
		List<Account> listAccounts;

		Account account1 = new Account("1234432100008765", 300, "12.2019");
		Account account2 = new Account("9876543200006543", 180, "10.2020");
		Account account3 = new Account("1357975300001111", 240, "02.2024");
		Account account4 = new Account("1234567890000567", 0, "05.2026");
		Account account5 = new Account("5647382900003434", -22, "04.2023");

		client.add(account1);
		client.add(account2);
		client.add(account3);
		client.add(account4);
		client.add(account5);

		listAccounts = clientLogic.sortByBalance(client.getAccounts());

		view.print("Список счетов клиента", listAccounts);
		System.out.println(clientLogic.sumPositiveBalance(listAccounts));
	}

}
