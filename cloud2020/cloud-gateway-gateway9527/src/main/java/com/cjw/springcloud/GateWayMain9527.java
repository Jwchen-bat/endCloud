package com.cjw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 西楚霸王
 * @date 2020/12/19 10:03
 * 相比zuul他是异步非阻塞的，效率高
 * 网关的依赖不用导入boot-web和监控依赖，否则报错
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class,args);
    }
}
