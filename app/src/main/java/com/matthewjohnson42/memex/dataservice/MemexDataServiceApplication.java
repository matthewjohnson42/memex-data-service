package com.matthewjohnson42.memex.dataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.matthewjohnson42.memex"})
public class MemexDataServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemexDataServiceApplication.class);
    }
}
