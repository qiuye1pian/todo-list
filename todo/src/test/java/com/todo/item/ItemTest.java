package com.todo.item;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void test_should_be_created_when_giving_item_text(){
        Item item = new Item("text");
        assertEquals("text",item.getText());

    }
}