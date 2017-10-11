package Cap15_4_5_6;

import java.io.Serializable;

public class TransactionRecord implements Serializable{

	private int numberAccount;
	private double valueTransaction;
	
	public TransactionRecord() {
		this(0, 0);
	}
	
	public TransactionRecord(int numberAccount, double valueTransaction) {
		setNumberAccount(numberAccount);
		setValueTransaction(valueTransaction);
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		if(numberAccount < 0) {
			throw new IllegalArgumentException("Número da conta menor que 0");
		}
		
		this.numberAccount = numberAccount;
	}

	public double getValueTransaction() {
		return valueTransaction;
	}

	public void setValueTransaction(double valueTransaction) {
		if(valueTransaction < 0) {
			throw new IllegalArgumentException("Valor da transação menor ou igual a 0");
		}
		
		this.valueTransaction = valueTransaction;
	}	
}
