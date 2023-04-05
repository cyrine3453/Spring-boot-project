package com.example.eshope;

import com.example.eshope.Repository.ArticleRepository;
import com.example.eshope.Repository.CommandLineRepository;
import com.example.eshope.Repository.CommandRepository;
import com.example.eshope.Repository.CreditCardPaymentRepository;
import com.example.eshope.Repository.PaymentRepository;
import com.example.eshope.Repository.PaypalPaymentRepository;
import com.example.eshope.Repository.RoleRepository;
import com.example.eshope.Repository.UserInformationsRepository;
import com.example.eshope.Repository.UtilisateurRepository;

import com.example.eshope.entities.Utilisateur;
import com.example.eshope.Repository.UtilisateurRepository;
import com.example.eshope.entities.Article;
import com.example.eshope.entities.Command;
import com.example.eshope.entities.CommandLine;
import com.example.eshope.entities.CreditCardPayment;
import com.example.eshope.entities.Payment;
import com.example.eshope.entities.PaypalPayment;
import com.example.eshope.entities.Role;
import com.example.eshope.entities.UserInformations;

import java.time.LocalDateTime;

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
        
        Utilisateur utilisateur2 = new Utilisateur();
        utilisateur2.setLogin("test");
        utilisateur2.setPassword("test");
        utilisateur2.setConnectionNumber(0);
        userRepository.save(utilisateur2);

         //Command
         CommandRepository commandRepository = test.getBean(CommandRepository.class);
         Command command = new Command();
         command.getIdCommand();
         command.setCommandDate(LocalDateTime.now());
         commandRepository.save(command);
 
         //CommandLine
         CommandLineRepository commandLineRepository = test.getBean(CommandLineRepository.class);
         CommandLine commandLine = new CommandLine();
         commandLine.setIdCommandLine(5);
         commandLine.setQuantity(5);
         commandLineRepository.save(commandLine);
 
         //UserInformations
         UserInformationsRepository userInformationsRepository = test.getBean(UserInformationsRepository.class);
         UserInformations userInformations = new UserInformations();
         userInformations.setAddress("test");
         userInformations.setCity("test");
         userInformations.setPhoneNumber(123456789);
         userInformations.setEmail("test");
         userInformationsRepository.save(userInformations);
 
         //Article
         ArticleRepository articleRepository = test.getBean(ArticleRepository.class);
         Article article = new Article();
         article.setIdArticle(0);
         article.setDescription("test");
         article.setPrice(0);
         article.setBrand("test");
         articleRepository.save(article);
 
 
 
         //Role
         RoleRepository roleRepository = test.getBean(RoleRepository.class);
         Role role = new Role();
         role.setIdRole(0);
         role.setRoleName("test");
         roleRepository.save(role);      
 
         //Payment
         PaymentRepository paymentRepository = test.getBean(PaymentRepository.class);
         Payment payment = new Payment();
         payment.setIdPayment(5);
         payment.setAmount(6);
         payment.setPaymentDate(LocalDateTime.now());
         paymentRepository.save(payment);
 
         //PaypalPayment
         PaypalPaymentRepository paypalPaymentRepository = test.getBean(PaypalPaymentRepository.class);
         PaypalPayment paypalPayment = new PaypalPayment();
         paypalPayment.setAccountNumber("12345678");
         paypalPaymentRepository.save(paypalPayment);
 
         //CreditCardPayment
         CreditCardPaymentRepository creditCardPaymentRepository = test.getBean(CreditCardPaymentRepository.class);
         CreditCardPayment creditCardPayment = new CreditCardPayment();
         creditCardPayment.setCardNumber("123456789");
         creditCardPayment.setExperationDate(LocalDateTime.now());
         creditCardPaymentRepository.save(creditCardPayment);
 
 
 
         //Add user to command
         command.setUtilisateur(utilisateur);
         commandRepository.save(command);
         //Add command to commandLine
         commandLine.setCommand(command);
         commandLineRepository.save(commandLine);
         //Add userInformations to user
         utilisateur.setUserInformations(userInformations);
         userRepository.save(utilisateur);
         //Add article to commandLine
         commandLine.setArticle(article);
         commandLineRepository.save(commandLine);
    }
}
