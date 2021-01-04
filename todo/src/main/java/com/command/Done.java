package com.command;

import com.todo.item.Item;
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
        Item targetItem = todoList.findItemAndFinishItem(this.itemIndex);
        if (targetItem == null) {
            return String.format("Item <%d> not found.", this.itemIndex);
        } else {
            return String.format("Item <%d> done.", this.itemIndex);
        }
    }

    int getItemIndex() {
        return this.itemIndex;
    }
}
