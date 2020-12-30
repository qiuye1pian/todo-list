package command;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandFactoryTest {

    @Test
    public void test_create_add_command(){
        //Given
        String inputCommandString = "todo add <item>";
        //When
        Command command = CommandFactory.createCommand(inputCommandString);
        //Then
        assertEquals("add",command.getAction());
    }
}




