package command;

import com.todo.item.Item;
import com.todo.list.TodoList;

public class AddItem extends CommandBase {

    private String itemText;

    AddItem(String text) {
        super("add");
        this.itemText = text;
    }


    @Override
    public String doAction(TodoList todoList) {
        Item newItem = todoList.add(this.itemText);
        return String.format("%s%n%nItem <%d> added", newItem.toString(), newItem.getIndex());
    }

    String getItemText() {
        return this.itemText;
    }
}
