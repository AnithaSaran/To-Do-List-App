package com.edubridge.todoapp.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.edubridge.todoapp.model.Todo;

public interface TodoServiceImp {
	
	List<Todo> getTodosByUser(String user);

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String name, String desc, Date targetDate, boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}
