package com.example1.demo1;

import java.util.Optional;
import java.lang.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.demo1.models.User;

public interface userrepository extends JpaRepository<User,Integer>{
	Optional<User> findByUserName(String userName);

}
