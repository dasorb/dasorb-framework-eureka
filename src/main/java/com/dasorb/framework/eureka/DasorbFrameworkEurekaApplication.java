package com.dasorb.framework.eureka;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableAdminServer
@EnableWebSecurity
@SpringBootApplication
public class DasorbFrameworkEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DasorbFrameworkEurekaApplication.class, args);
    }

}
