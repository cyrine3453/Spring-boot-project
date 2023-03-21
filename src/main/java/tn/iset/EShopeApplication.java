package tn.iset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import tn.iset.entities.User;

@SpringBootApplication
@RestController
public class EShopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EShopeApplication.class, args);
        User user1 = new User(1, "user1", "user1", 0);
        System.out.println(user1);
    }
}
