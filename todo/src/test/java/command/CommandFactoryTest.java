package command;

import com.todo.list.TodoList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void test_todo_list_command() {
        //Given
        String inputCommandString = "todo list";
        //When
        CommandBase command = CommandFactory.createCommand(inputCommandString);
        //Then
        assertEquals(Listing.class, command.getClass());
        assertEquals("list", command.getAction());
    }

    @Test
    public void test_todo_list_all_command() {
        //Given
        String inputCommandString = "todo list --all";
        //When
        CommandBase command = CommandFactory.createCommand(inputCommandString);
        //Then
        assertEquals(Listing.class, command.getClass());
        assertEquals("list", command.getAction());
        assertEquals("all",((Listing)command).getParameter());
    }
}




