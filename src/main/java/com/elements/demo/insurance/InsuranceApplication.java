package com.elements.demo.insurance;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class InsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
	}
	
	/**
	 * Declare the task executor bean to be used with @async
	 * In this demo I am only using it for sending emails
	 * @return
	 */
    @Bean
    public Executor taskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }	
}
