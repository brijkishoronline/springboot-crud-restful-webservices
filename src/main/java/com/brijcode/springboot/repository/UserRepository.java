package com.brijcode.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brijcode.springboot.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
