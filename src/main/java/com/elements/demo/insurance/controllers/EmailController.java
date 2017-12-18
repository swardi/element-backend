package com.elements.demo.insurance.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elements.demo.insurance.model.QuoteRequest;
import com.elements.demo.insurance.model.QuoteResponse;
import com.elements.demo.insurance.services.EmailService;
import com.elements.demo.insurance.services.QuoteRequestService;

@RestController
public class EmailController {

	@Autowired
	EmailService emailService;
	@Autowired
	QuoteRequestService quoteRequestService;
	
	private static final QuoteResponse success = new QuoteResponse(EmailStatus.SCHEDULED, Collections.emptyList());
	
	@RequestMapping(method=RequestMethod.POST, path="api/sendemail")
	public ResponseEntity<QuoteResponse> sendEmail(@RequestBody QuoteRequest quoteRequest){
		List<String> messages = quoteRequestService.validateQuoteRequest(quoteRequest);
		if(messages.size() > 0){
			return ResponseEntity.ok(new QuoteResponse(EmailStatus.FAILED, messages));
		}
		emailService.scheduleQuoteEmail(quoteRequest);
		return ResponseEntity.ok(success);
	}
}
