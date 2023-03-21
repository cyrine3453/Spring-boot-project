package com.example.eshope;

import com.example.eshope.Repository.CommandRepository;
import com.example.eshope.Repository.UserInformationsRepository;
import com.example.eshope.Repository.UserRepository;
import com.example.eshope.entities.Command;
import com.example.eshope.entities.UserInformations;
import com.example.eshope.entities.Utilisateur;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EShopeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext test = SpringApplication.run(EShopeApplication.class, args);
        UserRepository userRepository = test.getBean(UserRepository.class);
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setLogin("test");
        utilisateur.setPassword("test");
        utilisateur.setConnectionNumber(0);
        userRepository.save(utilisateur);
        
        CommandRepository commandRepository = test.getBean(CommandRepository.class);
        Command command = new Command();
        command.getIdCommand();
        command.setCommandDate(LocalDateTime.now());
        commandRepository.save(command);

        UserInformationsRepository userInformationsRepository = test.getBean(UserInformationsRepository.class);
        UserInformations userInformations = new UserInformations();
        userInformations.setAddress("test");
        userInformations.setCity("test");
        userInformations.setPhoneNumber(123456789);
        userInformations.setEmail("test");
        userInformationsRepository.save(userInformations);
        
    }
}
