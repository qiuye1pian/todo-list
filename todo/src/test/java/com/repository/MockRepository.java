package com.repository;

import com.todo.list.TodoList;

public class MockRepository implements IRepository {
    @Override
    public TodoList getTodoList() {
        return new TodoList();
    }

    @Override
    public String saveTodoList(TodoList todoList) {
        return "";
    }
}
