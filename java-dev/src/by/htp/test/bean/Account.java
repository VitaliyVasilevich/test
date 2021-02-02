package by.htp.test.bean;

import java.io.Serializable;

public class Account implements Serializable {

	private String accountNumber;
	private int balance;
	private boolean blocked;
	private String validity;
	private final String CURRENCY = "USD";

	public Account() {
	}

	public Account(String accountNumber, int balance, String validity) {
		if (accountNumber.length() != 16) {
			throw new RuntimeException(" Incorrect account number");
		}
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.validity = validity;
		if (balance < -20) {
			this.blocked = true;
		} else {
			this.blocked = false;
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public String getCurrency() {
		return CURRENCY;
	}

	public String getValidity() {
		return validity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CURRENCY == null) ? 0 : CURRENCY.hashCode());
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + balance;
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + ((validity == null) ? 0 : validity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (CURRENCY == null) {
			if (other.CURRENCY != null)
				return false;
		} else if (!CURRENCY.equals(other.CURRENCY))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (balance != other.balance)
			return false;
		if (blocked != other.blocked)
			return false;
		if (validity == null) {
			if (other.validity != null)
				return false;
		} else if (!validity.equals(other.validity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", blocked=" + blocked
				+ ", validity=" + validity + ", CURRENCY=" + CURRENCY + "]";
	}

}
