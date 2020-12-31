package command;

import com.todo.list.TodoList;

public class Done extends CommandBase {

    private int itemIndex = -1;

    public Done(int index) {
        super("done");
        this.itemIndex = index;
    }

    Done(String index) {
        super("done");
        this.itemIndex = Integer.valueOf(index);
    }

    @Override
    public String doAction(TodoList todoList) {
        return null;
    }

    int getItemIndex() {
        return this.itemIndex;
    }
}
