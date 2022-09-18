package com.nelson.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public abstract class BaseClass<IdType extends Serializable>{

    @Id
    @Type(type = "long")
    private IdType id;

}