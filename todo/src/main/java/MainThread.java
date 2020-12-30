import com.console.SystemIn;
import com.console.Input;
import com.console.Output;
import com.console.SystemOut;


public class MainThread {
    public static void main(String[] args) {
        Output output = new SystemOut();
        output.println("请输入命令：");
        output.println("推出请输入：exit");

        run(new SystemIn(), output);

        output.println("结束");
    }

    static void run(Input input, Output output) {
        String commandString;
        do {
            commandString = input.getUserInput();
            output.println("命令是" + commandString);
        } while (!commandString.equals("exit"));
    }

}
