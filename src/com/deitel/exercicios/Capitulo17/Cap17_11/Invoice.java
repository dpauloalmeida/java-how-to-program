package com.deitel.exercicios.Capitulo17.Cap17_11;

public class Invoice {

	private int partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	public Invoice(int partNumber, String partDescription, int quantity, double price) {
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setQuantity(quantity);
		setPrice(price);
	}

	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		if(partNumber <= 0) {
			throw new IllegalArgumentException("Número da peça menor ou igual a 0.");
		}
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		if(!partDescription.matches("[A-Z][a-zA-Z]+|[A-Z][a-zA-Z]+\\s[A-Z][a-zA-Z]+")) {
			throw new IllegalArgumentException("Descrição da peça contém caracteres inválidos.");
		}
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			throw new IllegalArgumentException("Quantidade menor que 0.");
		}
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price <= 0) {
			throw new IllegalArgumentException("Preço menor ou igual a 0.");
		}
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("  %02d%-9s%-21s%03d%13.2f", getPartNumber(), "",
				getPartDescription(), getQuantity(), getPrice());
	}

}
