package com.spring.cloud.configServer;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableEncryptableProperties
@EnableConfigurationProperties
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer.class, args);
    }
}
