package com.todo.list;

import com.todo.item.Item;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Item> itemList = new ArrayList<>();

    public Item add(String text) {
        Item newItem = new Item(itemList.size() + 1, text);
        itemList.add(newItem);
        return newItem;
    }

    public int totalSize() {
        return 1;
    }
}
