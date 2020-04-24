package com.dingding.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liudingding
 * @ClassName EurekaServerApplication
 * @description
 * @date 2020/1/23 19:41
 * Version 1.0
 */
@SpringBootApplication
//EurekaServer服务端启动类，接受其他服务注册进来
@EnableEurekaServer
public class EurekaServerApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7002.class, args);
    }
}
