package com.todo.item;

import org.apache.commons.lang.StringUtils;

public class Item {

    private final int index;
    private final String text;
    private String status = "";

    public Item(int index, String text) {
        this.index = index;
        this.text = text;
    }

    String getText() {
        return this.text;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        if(StringUtils.isNotEmpty(this.status)){
            return String.format("%d. [Done] <%s>", this.index, this.text);
        }
        return String.format("%d. <%s>", this.index, this.text);
    }

    public void done() {
        this.status = "done";
    }

    String getStatus() {
        return this.status;
    }
}
