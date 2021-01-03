package com.todo.list;

import com.todo.item.Item;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Item> itemList = new ArrayList<>();

    public Item add(String text) {
        Item newItem = new Item(getNewIndex(), text);
        itemList.add(newItem);
        return newItem;
    }

    private int getNewIndex() {
        return itemList.size() + 1;
    }

    int size() {
        return itemList.size();
    }
}
