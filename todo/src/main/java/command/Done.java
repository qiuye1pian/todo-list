package command;

import com.todo.list.TodoList;

public class Done extends CommandBase {

    private int itemIndex;

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
        return todoList.findItemAndFinishItem(this.itemIndex);
    }

    int getItemIndex() {
        return this.itemIndex;
    }
}
