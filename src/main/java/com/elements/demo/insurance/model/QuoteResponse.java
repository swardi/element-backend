package com.elements.demo.insurance.model;

import java.util.List;

import com.elements.demo.insurance.controllers.EmailStatus;

public class QuoteResponse {
	private EmailStatus emailStatus;
	private List<String> messages;
	public QuoteResponse(EmailStatus emailStatus, List<String> messages) {
		super();
		this.emailStatus = emailStatus;
		this.messages = messages;
	}
	public EmailStatus getEmailStatus() {
		return emailStatus;
	}
	public List<String> getMessages() {
		return messages;
	}	
}
