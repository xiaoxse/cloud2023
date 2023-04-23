package com.atguigu.springcloud.entities.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Mouoal
 * @Description: 说明用途
 * @Date 2023/4/20 15:47
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8001.class, args);
    }
}
