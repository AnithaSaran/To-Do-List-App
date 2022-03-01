package com.edubridge.todoapp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.edubridge.todoapp.dao.TodoDao;
import com.edubridge.todoapp.model.Todo;


@RunWith(SpringRunner.class)
@SpringBootTest
class TodoAppTests {

	@Test
	void contextLoads() {
			
	}
	
	@Autowired
	TodoDao todoDao ;
	
	@Test
	void saveTodoTest() {
		Todo todo = new Todo();
		todoDao.save(todo);
		boolean actualResult = todoDao.existsById((long) 20);
		Assertions.assertTrue(actualResult);
		
	}
	@Test
	void updateTodoTest() {
		Todo todo = new Todo();
		todoDao.save(todo);
		boolean actualResult = todoDao.existsById((long) 20);
		Assertions.assertTrue(actualResult);
		
	}
	
	
	@Test
	void deleteTodoTest() {
	 Todo todo= new Todo();
		todoDao.delete(todo);
		boolean actualResult = todoDao.existsById((long) 4);
		Assertions.assertTrue(actualResult);
	}
}
