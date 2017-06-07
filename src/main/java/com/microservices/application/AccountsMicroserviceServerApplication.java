package com.microservices.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by sowmyaparameshwara on 6/1/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AccountsMicroserviceServerApplication {

    public static void main(String[] args){
        SpringApplication.run(AccountsMicroserviceServerApplication.class,args);
    }

}
