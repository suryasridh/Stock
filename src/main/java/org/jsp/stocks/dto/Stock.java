package org.jsp.stocks.dto;
 
 import lombok.Getter;
 import lombok.Setter;
 import lombok.ToString;
 
 @Setter
 @Getter
 @ToString
 public class Stock {
 	private String ticker;
 	private String companyName;
 	private double price;
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