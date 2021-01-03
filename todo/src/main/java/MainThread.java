import com.console.SystemIn;
import com.console.Input;
import com.console.Output;
import com.console.SystemOut;
import com.todo.list.TodoList;
import command.CommandBase;
import command.CommandFactory;
import command.Exit;


public class MainThread {
    public static void main(String[] args) {
        Output output = new SystemOut();
        output.println("请输入命令：");
        output.println("推出请输入：exit");

        run(new SystemIn(), output);

        output.println("结束");
    }

    static void run(Input input, Output output) {
        CommandBase commandBase;
        TodoList todoList = new TodoList();
        do {
            String commandString;
            commandString = input.getUserInput();
            commandBase = CommandFactory.createCommand(commandString);
            output.println(commandBase.doAction(todoList));
        } while (!(commandBase instanceof Exit));
    }

}
