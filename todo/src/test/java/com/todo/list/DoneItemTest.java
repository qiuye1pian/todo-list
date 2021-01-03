package com.todo.list;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class DoneItemTest {

    @Test
    public void test_todoList_can_set_item_done() {

        TodoList todoList = new TodoList();
        todoList.addNewItem("test");
        assertEquals("Item <1> findItemAndSetItemdone.", todoList.findItemAndSetItemdone(1));
    }
    @Test
    public void test_should_be_not_found_when_todoList_index_out_of_range() {

        TodoList todoList = new TodoList();
        assertEquals("Item <1> not found.", todoList.findItemAndSetItemdone(1));
    }

    @Test
    public void test_index_should_increase_when_add_new_item() {
        TodoList todoList = new TodoList();
        todoList.addNewItem("item1");
        todoList.addNewItem("item2");
        assertEquals("Item <2> findItemAndSetItemdone.", todoList.findItemAndSetItemdone(2));
        assertEquals("Item <1> findItemAndSetItemdone.", todoList.findItemAndSetItemdone(1));
    }

}
