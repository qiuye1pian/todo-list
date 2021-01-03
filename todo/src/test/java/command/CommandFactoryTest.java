package command;

import com.todo.list.TodoList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandFactoryTest {

    @Test
    public void test_create_add_command() {
        //Given
        String inputCommandString = "todo addNewItem <item>";
        //When
        CommandBase command = CommandFactory.createCommand(inputCommandString);
        //Then
        assertEquals(Add.class, command.getClass());
        assertEquals("addNewItem", command.getAction());
        assertEquals("item", ((Add) command).getItemText());
    }

    @Test
    public void test_add_command_do_action() {
        String inputCommandString = "todo addNewItem <item>";
        TodoList todoList = new TodoList();
        CommandBase command = CommandFactory.createCommand(inputCommandString);
        assertEquals("1. <item>\r\n" +
                        "\r\n" +
                        "Item <1> added",
                command.doAction(todoList));

    }

    @Test
    public void test_create_item_done_command() {
        //Given
        String inputCommandString = "todo done <2>";
        //When
        CommandBase command = CommandFactory.createCommand(inputCommandString);
        //Then
        assertEquals(Done.class, command.getClass());
        assertEquals("done", command.getAction());
        assertEquals(2, ((Done) command).getItemIndex());
    }

}




