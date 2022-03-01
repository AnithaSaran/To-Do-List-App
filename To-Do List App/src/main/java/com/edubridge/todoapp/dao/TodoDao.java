package com.edubridge.todoapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.todoapp.model.Todo;


public interface TodoDao extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}