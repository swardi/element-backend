package com.elements.demo.insurance.model;

import java.util.List;

public class QuoteRequest {
	private List<QuoteItem> quoteItems;
	private String customerEmail;
	
	public List<QuoteItem> getQuoteItems() {
		return quoteItems;
	}
	public void setQuoteItems(List<QuoteItem> quoteItems) {
		this.quoteItems = quoteItems;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
}
