package org.jsp.stocks.service;

import org.jsp.stocks.dto.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

public interface StockService {

	String register(User user, Model model);



	String verifyOtp(int id, int otp, HttpSession session);

	
	String login(String mail, String password, HttpSession session);



	String register(@Valid User user, BindingResult result, HttpSession session);


	String logout(HttpSession session);



}