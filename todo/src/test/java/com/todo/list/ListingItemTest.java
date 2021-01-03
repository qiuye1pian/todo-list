package com.todo.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ListingItemTest {

    @Test
    public void test_listing_all_on_going_item() {
        TodoList todoList = new TodoList();
        todoList.addNewItem("item1");
        todoList.addNewItem("item2");
        todoList.addNewItem("item3");
        assertEquals(3, todoList.getAllOngoing().size());
    }

}
