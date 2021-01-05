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


public class MainThread {
    public static void main(String[] args) {
        Output output = new SystemOut();

        output.println("请输入命令：");
        output.println("推出请输入：exit");

        IRepository fileRepository = tryToCreateFileRepository("\\TodoList.repo");

        if (fileRepository == null) {
            output.println("Can not open file.");
            return;
        }

        run(fileRepository, new SystemIn(), output);

        output.println("结束");
    }

    static void run(IRepository iRepository, Input input, Output output) {
        CommandBase commandBase;

        TodoList todoList = iRepository.getTodoList();
        do {
            String commandString;
            commandString = input.getUserInput();
            commandBase = CommandFactory.createCommand(commandString);
            output.println(commandBase.doAction(todoList));
        } while (!(commandBase instanceof Exit));
        iRepository.saveTodoList(todoList);
    }

    private static IRepository tryToCreateFileRepository(String filePath) {
        try {
            return new TodoListFileRepository(filePath);
        } catch (IOException ex) {
            return null;
        }
    }

}
