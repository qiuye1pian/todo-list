package com.command;

import com.todo.list.TodoList;

public class Unknown extends CommandBase {

    Unknown() {
        super("unknown");
    }

    @Override
    public String doAction(TodoList todoList) {
        return "Unknown com.command";
    }

}
