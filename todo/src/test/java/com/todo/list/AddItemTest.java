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
    public void test_should_return_new_item_when_add_new_item()
    {
        TodoList todoList = new TodoList();
        Item newItem =  todoList.add("item1");
        assertNotNull(newItem);
    }

}
