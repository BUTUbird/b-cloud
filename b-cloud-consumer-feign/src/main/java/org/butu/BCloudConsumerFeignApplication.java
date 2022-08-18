package org.butu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableEurekaClient //表明这是一个eureka客户端
@EnableFeignClients(basePackages = "org.butu.*") //开启feign
public class BCloudConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(BCloudConsumerFeignApplication.class, args);
    }

}
