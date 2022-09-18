package com.nelson.example.demo.config;

import com.nelson.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDb {

    @Bean
    CommandLineRunner initDatabase(UserRepository repository){
        return args -> {
            //repository.saySomething();
            repository.findUserById(123L);
        };
    }
}
