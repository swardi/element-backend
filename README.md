# element-backend

#Technology Stack
Java 8 + SpringBoot + Maven

# Steps to run project
1) Clone project
2) Run command 
mvnw -Dspring.profiles.active=mockservices spring-boot:run

# APIs 

1) Load Modules
http://localhost:8099/api/modules

Request Type = GET


2) Send email
http://localhost:8099/api/sendemail

Request Type = POST
Parameters = customerEmail, quoteItems

Example
{
	"customerEmail" : "shamailademo@gmail.com",
	"quoteItems" : [{ "moduleId" : 1, "amount" : 350}]
}

# Code Organization

1) Controllers
EmailController
ModuleController

2) Services
EmailService: For sending quote request in an email.
ModuleService: For loading the available modules. 
PremiumSerivce: For calculating premium

3) Model
QuoteItem
InsuranceModule
