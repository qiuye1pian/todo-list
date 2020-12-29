package com.todo.item;

public class Item {

    private final int index;
    private final String text;

    public Item(int index, String text) {
        this.index = index;
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public int getIndex() {
        return index;
    }
}