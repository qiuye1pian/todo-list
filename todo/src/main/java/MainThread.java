import com.command.CommandBase;
import com.command.CommandFactory;
import com.command.Exit;
import com.console.Input;
import com.console.Output;
import com.console.SystemIn;
import com.console.SystemOut;
import com.repository.IRepository;
import com.repository.TodoListFileRepository;
import com.todo.list.TodoList;

import java.io.IOException;
import java.util.NoSuchElementException;


public class MainThread {
    public static void main(String[] args) {
        Output output = new SystemOut();

        output.println("welcome.");
        output.println("enter exit to end.");

        IRepository fileRepository = tryToCreateFileRepository("./TodoList.repo", output);

        run(fileRepository, new SystemIn(), output);

    }

    static void run(IRepository iRepository, Input input, Output output) {
        CommandBase commandBase;
        if (iRepository == null) {
            output.println("Can not initialize repository file.");
            return;
        }
        TodoList todoList = iRepository.getTodoList();
        do {
            try {
                commandBase = CommandFactory.createCommand(input.getUserInput());
                output.println(commandBase.doAction(todoList));
            } catch (NoSuchElementException noSuchElement) {
                break;
            } catch (Exception ex) {
                output.println(ex.getMessage());
                commandBase = CommandFactory.createUnknownCommand();
            }
        } while (!(commandBase instanceof Exit));
        iRepository.saveTodoList(todoList);
    }

    private static IRepository tryToCreateFileRepository(String filePath, Output output) {
        try {
            return new TodoListFileRepository(filePath);
        } catch (IOException ex) {
            output.println(ex.getMessage());
            return null;
        }
    }

}
