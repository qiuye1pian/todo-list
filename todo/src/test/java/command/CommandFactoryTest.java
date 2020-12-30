package command;

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
        assertEquals(AddItem.class, command.getClass());
        assertEquals("add", command.getAction());
        assertEquals("item",((AddItem)command).getItemText());
    }
}




