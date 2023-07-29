package com.jenkins.jenkinsspringproject;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringProjectApplication {
    static Logger logger = LoggerFactory.getLogger(JenkinsSpringProjectApplication.class);

    @PostConstruct
    public void intt() {
        logger.info("Application started ...");
    }

    public static void main(String[] args) {
        logger.info("Application executing ...");
		SpringApplication.run(JenkinsSpringProjectApplication.class, args);
    }

}
