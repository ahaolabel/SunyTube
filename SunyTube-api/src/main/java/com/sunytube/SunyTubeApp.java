package com.sunytube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SunyTubeApp {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(SunyTubeApp.class, args);
    }
}
