package com.todo.list;

import com.todo.item.Item;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class DoneItemTest {

    @Test
    public void test_todoList_can_set_item_done() {

        TodoList todoList = new TodoList();
        todoList.addNewItem("test");
        assertNotNull(todoList.findItemAndFinishItem(1));
    }

    @Test
    public void test_should_be_not_found_when_todoList_index_out_of_range() {

        TodoList todoList = new TodoList();
        assertNull(todoList.findItemAndFinishItem(1));
    }



}
