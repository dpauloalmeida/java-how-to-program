package Cap15_4_5_6;

import java.io.Serializable;

public class Account implements Serializable {
	
	private int account; // número da conta
	private String name; // nome completo
	private double balance; // saldo disponível
	
	public Account() {
		this(0, "", 0);
	}

	public Account(int account, String name, double balance) {
		setAccount(account);
		this.name = name;
		setBalance(balance);
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		if(account < 0) {
			throw new IllegalArgumentException("Número da conta menor que 0");
		}
		
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}	
	
	public void combine(TransactionRecord transaction) {
		setBalance(getBalance() + transaction.getValueTransaction()); 
	}
}
