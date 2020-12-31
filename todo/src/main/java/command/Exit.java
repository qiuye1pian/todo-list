package command;

import com.todo.list.TodoList;

public class Exit extends CommandBase {

    Exit() {
        super("exit");
    }

    @Override
    public String doAction(TodoList todoList) {
        return this.action;
    }
}
