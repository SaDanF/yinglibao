package org.example.api;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//mapper扫码地址，后面的是扫码的地址
@MapperScan(basePackages = "org.example.api.mapper")
//启动dubbo服务
@EnableDubbo
@SpringBootApplication
public class MicrDataserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrDataserviceApplication.class, args);
    }

}
