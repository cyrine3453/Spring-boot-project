package com.example.eshope;

import com.example.eshope.Repository.UserRepository;
import com.example.eshope.entities.Utilisateur;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EShopeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext test = SpringApplication.run(EShopeApplication.class, args);
    }
}
