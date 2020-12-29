package com.todo.item;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void test_should_be_created_when_giving_item_text() {
        Item item = new Item(1, "text");
        assertEquals("text", item.getText());
    }

    @Test
    public void test_should_have_index_when_create_new_item_with_index_and_text() {
        Item item = new Item(1, "text");
        assertEquals(1, item.getIndex());
    }

}