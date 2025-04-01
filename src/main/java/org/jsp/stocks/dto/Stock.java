package org.jsp.stocks.dto;
 
 import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
 import lombok.Setter;
 import lombok.ToString;
 @Entity
 @Setter
 @Getter
 @ToString
 public class Stock {
	 @Id
 	private String ticker;
 	private String companyName;
 	private double price;
 	
 	public double getChanges() {
		return changes;
	}
	public void setChanges(double changes) {
		this.changes = changes;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	private double changes;
 	private double quantity;
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
 }