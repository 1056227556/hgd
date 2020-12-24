package com.lxjn.hgd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lxjn.hgd.module.*.mapper")
public class HgdApplication {
    public static void main(String[] args) {
        SpringApplication.run(HgdApplication.class,args);
    }
}
