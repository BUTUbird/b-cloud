package org.butu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author BUTUbird
 */
@SpringBootApplication
@EnableEurekaClient
public class BCloudProvider1Application {
    public static void main(String[] args) {
        SpringApplication.run(BCloudProvider1Application.class, args);
    }

}
