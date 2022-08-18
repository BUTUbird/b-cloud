package org.butu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author BUTUbird
 */
@SpringBootApplication
@EnableEurekaServer
public class BCloudServerEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(BCloudServerEurekaApplication.class, args);
        System.out.println("---服务监控访问地址"+"http://localhost:8761");
    }
}
