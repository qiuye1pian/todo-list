package com.todo.list;

import com.todo.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TodoList {
    private List<Item> itemList = new ArrayList<>();

    public Item addNewItem(String text) {
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

    public Item findItemAndFinishItem(int itemIndex) {
        Optional<Item> targetItem = itemList.stream().filter(x -> x.getIndex() == itemIndex).findAny();
        if (targetItem.isPresent()) {
            targetItem.get().done();
            return targetItem.get();
        } else {
            return null;
        }
    }

    public List<Item> getAllOngoing() {
        return this.itemList.stream().filter(Item::ongoing).collect(Collectors.toList());
    }

}
