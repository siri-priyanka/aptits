package com.aptits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AptitsApplication extends SpringBootServletInitializer {

    // This method is required for WAR deployment to external Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AptitsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AptitsApplication.class, args);
    }
}
