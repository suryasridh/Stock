package org.jsp.stocks.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class User {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public List<UserStocksTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<UserStocksTransaction> transactions) {
		this.transactions = transactions;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min = 3, max = 15, message = "* It Should be between 3~15 charecters")
	private String name;
	@Email(message = "* It Should be Valid Email")
	@NotEmpty(message = "* It is Required Field")
	private String email;
	@DecimalMin(value = "6000000000", message = "* It should be Proper Mobile Number")
	@DecimalMax(value = "9999999999", message = "* It should be Proper Mobile Number")
	private long mobile;
	@Past(message = "* Enter Proper DOB")
	@NotNull(message = "* It is Required Field")
	private LocalDate dob;
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "* It should be One Uppercase, One Lowercase, One Number, One Special Chrecter,Minium 8 charecters")
	private String password;
	@Transient
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$", message = "* It should be One Uppercase, One Lowercase, One Number, One Special Chrecter,Minium 8 charecters")
	private String confirmPassword;
	private int otp;
	private boolean verified;

	private double amount;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<UserStocksTransaction> transactions=new ArrayList<>();
}
