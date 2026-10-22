package com.educandoweb.curso.config;

import com.educandoweb.curso.entities.User;
import com.educandoweb.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@email.com", "111111", "12314");
        User u2 = new User(null, "Alex Green", "alex@email.com", "12343","35142353");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
