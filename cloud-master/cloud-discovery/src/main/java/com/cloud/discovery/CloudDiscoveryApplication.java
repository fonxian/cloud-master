package com.cloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by fangzhijie on 2019/1/2.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDiscoveryApplication.class, args);
    }


}
