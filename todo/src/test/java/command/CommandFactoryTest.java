package command;

import com.todo.list.TodoList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CommandFactoryTest {

    @Test
    public void test_create_add_command() {
        //Given
        String inputCommandString = "todo add <item>";
        //When
        CommandBase command = CommandFactory.createCommand(inputCommandString);
        //Then
        assertEquals(Add.class, command.getClass());
        assertEquals("add", command.getAction());
        assertEquals("item", ((Add) command).getItemText());
    }

    @Test
    public void test_do_action() {
        String inputCommandString = "todo add <item>";
        TodoList todoList = new TodoList();
        CommandBase command = CommandFactory.createCommand(inputCommandString);
        assertEquals("1. <item>\r\n" +
                        "\r\n" +
                        "Item <1> added",
                command.doAction(todoList));

    }

}




