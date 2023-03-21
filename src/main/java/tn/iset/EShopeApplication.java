package tn.iset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EShopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EShopeApplication.class, args);
    }

    @GetMapping("/Cyrine")
    public  String hello(){
        return "meow meow ";
    }

}
