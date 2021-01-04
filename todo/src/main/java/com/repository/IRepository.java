package com.repository;

import com.todo.list.TodoList;

public interface IRepository {

    TodoList getTodoList();

    void saveTodoList(TodoList todoList);

}
