package command;

import com.todo.list.TodoList;

public abstract class CommandBase {
    String action;

    public CommandBase(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }

    public abstract String doAction(TodoList todoList);
}
