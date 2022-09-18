package com.nelson.example.demo.repository;

import com.nelson.example.demo.model.BaseClass;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class SharedRepositoryCustomImpl<T extends BaseClass, IdType extends Serializable> implements SharedRepositoryCustom{
    @Override
    public void findUserById(Long Id) {
        System.out.println("hello from shared thing!");
    }
}
