package com.nelson.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@Getter
@Setter
@Entity
public class User extends BaseClass<Long>{
    private String name;
    private int age;
}
