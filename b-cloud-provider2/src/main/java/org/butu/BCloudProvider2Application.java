package org.butu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(BCloudProvider2Application.class, args);
    }

}
