package com.elements.demo.insurance.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elements.demo.insurance.model.InsuranceModule;
import com.elements.demo.insurance.model.QuoteItem;
import com.elements.demo.insurance.model.QuoteRequest;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	ModuleService moduleService;
	
	@Override
	public int calculatePremium(QuoteRequest quoteRequest) {
		Map<Integer, InsuranceModule> modules = moduleService.getModulesMap();
		int premium = 0;
		for(QuoteItem quoteItem : quoteRequest.getQuoteItems()){
			InsuranceModule module = modules.get(quoteItem.getModuleId());
			premium += quoteItem.getAmount() * module.getRiskFactor() / 100.0f;
		}
		return premium;
	}

}
