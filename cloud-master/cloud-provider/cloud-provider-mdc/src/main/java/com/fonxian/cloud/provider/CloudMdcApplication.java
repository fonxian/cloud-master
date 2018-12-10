package com.fonxian.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by fangzhijie on 2018/12/11.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudMdcApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudMdcApplication.class, args);
    }


}
