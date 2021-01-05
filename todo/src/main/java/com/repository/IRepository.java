package com.repository;

import com.todo.list.TodoList;

public interface IRepository {

    TodoList getTodoList();

    String saveTodoList(TodoList todoList);

}
