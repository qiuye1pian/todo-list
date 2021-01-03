package com.todo.list;

import com.todo.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    String findItemAndSetItemdone(int itemIndex) {
        Optional<Item> targetItem = itemList.stream().filter(x -> x.getIndex() == itemIndex).findAny();
        if (targetItem.isPresent()) {
            targetItem.get().done();
            return String.format("Item <%d> findItemAndSetItemdone.", itemIndex);
        } else {
            return String.format("Item <%d> not found.", itemIndex);
        }
    }
}
