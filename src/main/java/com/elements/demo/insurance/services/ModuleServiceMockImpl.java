package com.elements.demo.insurance.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.elements.demo.insurance.model.InsuranceModule;

@Profile("mockservices")
@Service
public class ModuleServiceMockImpl implements ModuleService {

	@SuppressWarnings("serial")
	private static Map<Integer, InsuranceModule> mockModules = new  HashMap<Integer, InsuranceModule>(){{
		put(1, module(1,  3000, 10, "Bike", 30));
		put(2, module(2, 10000, 500, "Jewelry", 5));
		put(3, module(3, 6000, 500, "Electronics", 35));
		put(4, module(4, 20000, 10, "Sports Equipment", 30));
	}};

	@Override
	public Collection<InsuranceModule> getAllModules() {
		return mockModules.values();
	}
	
	protected static InsuranceModule module(int id, int maximumValue, int minimumValue, String moduleName, int riskFactor) {
		InsuranceModule module = new InsuranceModule();
		module.setId(id);
		module.setMaximumValue(maximumValue);
		module.setMinimumValue(minimumValue);
		module.setModuleName(moduleName);
		module.setRiskFactor(riskFactor);
		return module;
	}

	@Override
	public Map<Integer, InsuranceModule> getModulesMap() {
		return mockModules;
	}

}
