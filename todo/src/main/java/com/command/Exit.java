package com.command;

import com.todo.list.TodoList;
import org.apache.commons.lang.StringUtils;

public class Exit extends CommandBase {

    Exit() {
        super("exit");
    }

    @Override
    public String doAction(TodoList todoList) {
        return StringUtils.EMPTY;
    }
}
