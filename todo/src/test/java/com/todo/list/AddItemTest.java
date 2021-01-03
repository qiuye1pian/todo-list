package com.todo.list;

import com.todo.item.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class AddItemTest {

    @Test
    public void test_todoList_can_add_item() {
        //Given
        TodoList todoList = new TodoList();
        //When
        todoList.addNewItem("item1");
        //Then
        assertEquals(1, todoList.size());
    }

    @Test
    public void test_todoList_can_calculate_total() {
        TodoList todoList = new TodoList();
        todoList.addNewItem("1");
        todoList.addNewItem("2");
        assertEquals(2, todoList.size());
    }

    @Test
    public void test_should_return_new_item_when_add_new_item() {
        TodoList todoList = new TodoList();
        Item newItem = todoList.addNewItem("item1");
        assertNotNull(newItem);
    }

    @Test
    public void test_index_should_increase_when_add_new_item() {
        TodoList todoList = new TodoList();
        Item item1 = todoList.addNewItem("item1");
        Item item2 = todoList.addNewItem("item2");
        assertEquals(1, item1.getIndex());
        assertEquals(2, item2.getIndex());
    }

}
