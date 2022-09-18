package com.nelson.example.demo.repository;

import com.nelson.example.demo.model.BaseClass;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

public interface SharedRepositoryCustom<T extends BaseClass, IdType extends Serializable> {
    void findUserById(Long id);
}
