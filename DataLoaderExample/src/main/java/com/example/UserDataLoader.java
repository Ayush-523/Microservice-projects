package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.beans.Userr;
import com.example.repo.UserRepo;

import jakarta.annotation.PostConstruct;

@Component
public class UserDataLoader {

    @Autowired
    private UserRepo repo;

    @PostConstruct
    public void loadDummyData() {

        Userr user1 = new Userr(1, "User1", "Address1");
        Userr user2 = new Userr(2, "User2", "Address2");
        Userr user3 = new Userr(3, "User3", "Address3");
        Userr user4 = new Userr(4, "User4", "Address4");

        repo.save(user1);
        repo.save(user2);
        repo.save(user3);
        repo.save(user4);

        System.out.println("Dummy Data Inserted Successfully");
    }
}