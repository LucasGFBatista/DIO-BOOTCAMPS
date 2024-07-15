package com.lucas.Aula_spring_data_jpa;

import com.lucas.Aula_spring_data_jpa.model.User;
import com.lucas.Aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Lucas");
        user.setUserName("LucasGFBatista");
        user.setPassword("teste123");

        userRepository.save(user);

        for(User u : userRepository.findAll()){
            System.out.println(u);
        }


    }
}
