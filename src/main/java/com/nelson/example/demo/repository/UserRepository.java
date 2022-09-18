package com.nelson.example.demo.repository;

import com.nelson.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom, SharedRepositoryCustom<User, Long> {
}
