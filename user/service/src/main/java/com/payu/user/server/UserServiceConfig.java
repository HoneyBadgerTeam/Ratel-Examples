package com.payu.user.server;

import com.payu.discovery.register.config.DiscoveryServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = {"com.payu.user.server", "com.payu.training.service"})
@Configuration
@EnableAutoConfiguration
@Import(DiscoveryServiceConfig.class)
public class UserServiceConfig {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserServiceConfig.class, args);
    }

}
