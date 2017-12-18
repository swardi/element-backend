package com.elements.demo.insurance.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.elements.demo.insurance.model.QuoteRequest;

@Service
public class EmailServiceImpl implements EmailService{
	
    @Autowired
    public JavaMailSender emailSender;

    @Autowired
    public QuoteRequestService quoteRequestService;

    @Async
	@Override
	public void scheduleQuoteEmail(QuoteRequest quoteRequest) {
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo(quoteRequest.getCustomerEmail()); 
        message.setSubject("The quote you requested"); 
        message.setText(quoteRequestService.quoteRequestText(quoteRequest));
        emailSender.send(message);		
	}    

}
