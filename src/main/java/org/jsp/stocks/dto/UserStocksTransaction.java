package org.jsp.stocks.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserStocksTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String stock_ticker;
	private double quantity;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStock_ticker() {
		return stock_ticker;
	}
	public void setStock_ticker(String stock_ticker) {
		this.stock_ticker = stock_ticker;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
