# element-backend

#Technology Stack
Java 8 + SpringBoot + Maven

# Steps to run project
1) Clone project
2) Run command 
mvnw -Dsrping.profileactive=mockservices

# APIs 

1) Load Modules
http://localhost:8080/api/modules

Request Type = GET


2) Send email
http://localhost:8080/api/sendemail

Request Type = POST
Parameters = customerEmail, quoteItems

Example
{
	"customerEmail" : "shamailademo@gmail.com",
	"quoteItems" : [{ "moduleId" : 1, "amount" : 350}]
}
