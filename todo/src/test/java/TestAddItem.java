import com.todo.list.TodoList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestAddItem {

    @Test
    public void test_todoList_can_add_item(){
        //Given
        TodoList todoList = new TodoList();
        //When
        todoList.add("item1");
        //Then
        assertEquals(1,todoList.totalSize());
    }

}
