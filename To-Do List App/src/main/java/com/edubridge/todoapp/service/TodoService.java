package com.edubridge.todoapp.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.todoapp.dao.TodoDao;
import com.edubridge.todoapp.model.Todo;



@Service
public class TodoService implements TodoServiceImp{
    
	@Autowired
	private TodoDao todoDoa;
	@Override
	public List<Todo> getTodosByUser(String user) {
		return todoDoa.findByUserName(user);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoDoa.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoDoa.save(todo);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todoDoa.save(new Todo( name, desc, targetDate, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoDoa.findById(id);
		if (todo.isPresent()) {
			todoDoa.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		todoDoa.save(todo);
	}

}