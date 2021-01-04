package com.command;

import com.todo.list.TodoList;

public class Listing extends CommandBase {

    String parameter;

    Listing(String parameter) {
        super("list");
        this.parameter = parameter;
    }

    @Override
    public String doAction(TodoList todoList) {
        if ("all".equalsIgnoreCase(this.parameter)) {
            StringBuilder stringBuilder = new StringBuilder();
            todoList.getAllItems().forEach(x -> stringBuilder.append(x.toString()).append("\r\n"));
            stringBuilder.append(String.format("%n%nTotal: %d items, %d item done",
                    todoList.getAllItems().size(), todoList.getAllFinished().size()));
            return stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            todoList.getAllOngoing().forEach(x -> stringBuilder.append(x.toString()).append("\r\n"));
            stringBuilder.append(String.format("%n%nTotal: %d items", todoList.getAllOngoing().size()));
            return stringBuilder.toString();
        }

    }

    String getParameter() {
        return this.parameter;
    }
}
