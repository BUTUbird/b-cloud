package org.butu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author BUTUbird
 */
@SpringBootApplication
@EnableZuulProxy  //开启zuul代理
@EnableEurekaClient        //zuul服务要注册到Eureka上
public class BCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BCloudZuulApplication.class, args);
    }

}
