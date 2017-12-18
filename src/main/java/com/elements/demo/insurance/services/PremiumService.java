package com.elements.demo.insurance.services;

import com.elements.demo.insurance.model.QuoteRequest;

public interface PremiumService {
	public int calculatePremium(QuoteRequest quoteRequest);
}
