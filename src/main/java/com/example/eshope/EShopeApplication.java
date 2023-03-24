package com.example.eshope;


import com.example.eshope.Repository.UtilisateurRepository;

import com.example.eshope.entities.Utilisateur;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EShopeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext test = SpringApplication.run(EShopeApplication.class, args);

        //User
        UtilisateurRepository userRepository = test.getBean(UtilisateurRepository.class);
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setLogin("test");
        utilisateur.setPassword("test");
        utilisateur.setConnectionNumber(0);
        userRepository.save(utilisateur);



    }
}
