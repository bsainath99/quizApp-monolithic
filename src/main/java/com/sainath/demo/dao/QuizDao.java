package com.sainath.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sainath.demo.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
