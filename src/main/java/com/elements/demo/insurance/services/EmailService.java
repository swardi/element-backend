package com.elements.demo.insurance.services;

import com.elements.demo.insurance.model.QuoteRequest;

public interface EmailService {
	public void scheduleQuoteEmail(QuoteRequest quoteRequest);
}
