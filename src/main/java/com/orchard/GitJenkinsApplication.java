package com.orchard;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(GitJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("app started ........");
	}
	
	
	public static void main(String[] args) {
		logger.info("app executed ........");
		SpringApplication.run(GitJenkinsApplication.class, args);
	}

}
