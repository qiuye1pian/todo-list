package com.todo.list;

import com.todo.item.Item;
import com.todo.list.TodoList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class AddItemTest {

    @Test
    public void test_todoList_can_add_item() {
        //Given
        TodoList todoList = new TodoList();
        //When
        todoList.add("item1");
        //Then
        assertEquals(1, todoList.totalSize());
    }

    @Test
    public void test_todoList_can_calculate_total() {
        TodoList todoList = new TodoList();
        todoList.add("1");
        todoList.add("2");
        assertEquals(2, todoList.totalSize());
    }

    @Test
    public void test_should_return_new_item_when_add_new_item() {
        TodoList todoList = new TodoList();
        Item newItem = todoList.add("item1");
        assertNotNull(newItem);
    }

    @Test
    public void test_index_should_increase_when_add_new_item() {
        TodoList todoList = new TodoList();
        Item item1 = todoList.add("item1");
        Item item2 = todoList.add("item2");
        assertEquals(1, item1.getIndex());
        assertEquals(2, item2.getIndex());
    }

}
