package com.nelson.example.demo.repository;

import com.nelson.example.demo.model.BaseClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface SharedRepository<T extends BaseClass, IdType extends Serializable> extends CrudRepository<T, IdType>, SharedRepositoryCustom {
}
