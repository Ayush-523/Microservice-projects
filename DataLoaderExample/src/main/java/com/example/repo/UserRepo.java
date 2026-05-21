package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Userr;

public interface UserRepo extends JpaRepository<Userr, Integer> {

}