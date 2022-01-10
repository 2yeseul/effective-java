package com.example.effectivejava;

import com.example.effectivejava.ch03.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EffectiveJavaApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        SpringApplication.run(EffectiveJavaApplication.class, args);

        Singleton singleton = Singleton.INSTANCE;

    }

}
