package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Mouoal
 * @Description: 说明用途
 * @Date 2023/4/23 11:58
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer //启动Eureka服务端
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
