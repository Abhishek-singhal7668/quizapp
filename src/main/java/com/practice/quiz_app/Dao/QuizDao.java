package com.practice.quiz_app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.quiz_app.Model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}