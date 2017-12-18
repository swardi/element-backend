package com.elements.demo.insurance.model;

public class InsuranceModule {
	private int id;
	private int minimumValue;
	private int maximumValue;
	private int riskFactor;
	private String moduleName;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getMinimumValue() {
		return minimumValue;
	}
	
	public void setMinimumValue(int minimumValue) {
		this.minimumValue = minimumValue;
	}
	
	public int getMaximumValue() {
		return maximumValue;
	}
	
	public void setMaximumValue(int maximumValue) {
		this.maximumValue = maximumValue;
	}
	
	public int getRiskFactor() {
		return riskFactor;
	}
	
	public void setRiskFactor(int riskFactor) {
		this.riskFactor = riskFactor;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
}
