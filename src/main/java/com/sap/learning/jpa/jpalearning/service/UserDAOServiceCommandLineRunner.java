package com.sap.learning.jpa.jpalearning.service;

import com.sap.learning.jpa.jpalearning.entity.User;
import com.sap.learning.jpa.jpalearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Ranga","Admin");
        User user2 = new User("Ram","user");
        User user3 = new User("Andrew","Admin");
        User user4 = new User("Ajay","user");
//        userDAOService.insertUser(user1);
//        userDAOService.insertUser(user2);
//        userDAOService.insertUser(user3);
//        userDAOService.insertUser(user4);
        userRepository.save(user1);

    }
}
