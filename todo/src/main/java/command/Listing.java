package command;

import com.todo.list.TodoList;

public class Listing extends CommandBase {

    Listing(String args) {
        super("list");
    }

    @Override
    public String doAction(TodoList todoList) {
        StringBuilder stringBuilder = new StringBuilder();
        todoList.getAllOngoing().forEach(x -> stringBuilder.append(x.toString()));
        return stringBuilder.toString();
    }
}
