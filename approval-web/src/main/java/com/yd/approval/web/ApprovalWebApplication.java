package com.yd.approval.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by yandong on 2020/9/5.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.yd.approval")
public class ApprovalWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApprovalWebApplication.class, args);
    }
}
