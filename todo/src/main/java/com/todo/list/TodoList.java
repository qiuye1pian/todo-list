package com.todo.list;

import com.todo.item.Item;

public class TodoList {

    public Item add(String item1) {
        return new Item(item1);
    }

    public int totalSize() {
        return 1;
    }
}
