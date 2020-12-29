import com.console.SystemIn;
import com.console.Input;
import com.console.Output;
import com.console.SystemOut;


public class MainThread {
    public static void main(String[] args) {
        run(new SystemIn(), new SystemOut());
    }

    private static void run(Input input, Output output) {
        output.println("请输入命令：");
        output.println("推出请输入：exit");

        String commandString;
        do {
            commandString = input.getUserInput();
            output.println("命令是" + commandString);
        } while (!commandString.equals("exit"));

        output.println("结束");
    }

}
