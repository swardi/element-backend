package com.elements.demo.insurance.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elements.demo.insurance.model.InsuranceModule;
import com.elements.demo.insurance.model.QuoteItem;
import com.elements.demo.insurance.model.QuoteRequest;

@Service
public class QuoteRequestServiceImpl implements QuoteRequestService {

	@Autowired
	ModuleService moduleService;
	
	@Autowired
	PremiumService premiumService;
	
	@Override
	public List<String> validateQuoteRequest(QuoteRequest request) {
		List<String> errors = new ArrayList<String>();
		for(QuoteItem item : request.getQuoteItems()){
			InsuranceModule module = moduleService.getModulesMap()
					.get(item.getModuleId());
			if(item.getAmount()>0 && 
					(item.getAmount()>module.getMaximumValue() || 
					 item.getAmount()<module.getMinimumValue())){
				errors.add(String.format("Coverage amount is not within allowed range for %s", 
						module.getModuleName() ));
			}
		}
		return errors;
	}
	
	@Override
	public String quoteRequestText(QuoteRequest quoteRequest) {
        StringBuilder textRepresentation = new StringBuilder();
        textRepresentation.append(String.format("You requested quote for %d components. "
        		+ "\n Details are below "
        		, quoteRequest.getQuoteItems().size()));
        for(QuoteItem quoteItem : quoteRequest.getQuoteItems()){        	
        	textRepresentation.append(quoteItemText(quoteItem));
        }
        textRepresentation.append(String.format("\n Total premium: %d",
        		premiumService.calculatePremium(quoteRequest))
        		);
		return textRepresentation.toString();
	}
	
	private String quoteItemText(QuoteItem quoteItem) {
		InsuranceModule module = moduleService.getModulesMap()
				.get(quoteItem.getModuleId());
		return String.format("\n Coverage of $ %d for %s", 
				quoteItem.getAmount(), 
				module.getModuleName());
	}
}
