package com.nelson.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom{

    @Override
    public void saySomething() {
        System.out.println("hello from here!");
    }
}
