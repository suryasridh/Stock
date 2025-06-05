package org.jsp.stocks.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AdminData {
	@Id
	private final int id=1;
	private double totalPlatformFee;
	private double platformFeePercentage;
	private double totalStocksBought;
	private double totalStocksSold;
	public double getTotalPlatformFee() {
		return totalPlatformFee;
	}
	public void setTotalPlatformFee(double totalPlatformFee) {
		this.totalPlatformFee = totalPlatformFee;
	}
	public double getPlatformFeePercentage() {
		return platformFeePercentage;
	}
	public void setPlatformFeePercentage(double platformFeePercentage) {
		this.platformFeePercentage = platformFeePercentage;
	}
	public double getTotalStocksBought() {
		return totalStocksBought;
	}
	public void setTotalStocksBought(double totalStocksBought) {
		this.totalStocksBought = totalStocksBought;
	}
	public double getTotalStocksSold() {
		return totalStocksSold;
	}
	public void setTotalStocksSold(double totalStocksSold) {
		this.totalStocksSold = totalStocksSold;
	}
	public double getTotalTransaction() {
		return totalTransaction;
	}
	public void setTotalTransaction(double totalTransaction) {
		this.totalTransaction = totalTransaction;
	}
	public int getId() {
		return id;
	}
	private double totalTransaction;
}
