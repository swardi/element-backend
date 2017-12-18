package com.elements.demo.insurance.services;

import java.util.Collection;
import java.util.Map;

import com.elements.demo.insurance.model.InsuranceModule;

public interface ModuleService {
	public Collection<InsuranceModule> getAllModules();
	public Map<Integer, InsuranceModule> getModulesMap();
}