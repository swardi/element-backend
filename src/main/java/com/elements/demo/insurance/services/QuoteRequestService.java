package com.elements.demo.insurance.services;

import java.util.List;

import com.elements.demo.insurance.model.QuoteRequest;

public interface QuoteRequestService {
	
	/**
	 * Validate a quote request 
	 * @param request
	 * @return List of validation errors or empty list if no issue is found 
	 */
	public List<String> validateQuoteRequest(QuoteRequest request);
	public String quoteRequestText(QuoteRequest request);
}
