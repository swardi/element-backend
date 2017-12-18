package com.elements.demo.insurance.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elements.demo.insurance.model.InsuranceModule;
import com.elements.demo.insurance.services.ModuleService;

@RestController
public class ModuleController {

	@Autowired
	private ModuleService moduleService;
	
    @RequestMapping("api/modules")
    public Collection<InsuranceModule> getAllModules() {
    	return moduleService.getAllModules();
    }	
}
