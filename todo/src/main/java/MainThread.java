import com.console.CommandReceiver;


public class MainThread {
    public static void main(String args[]) {

        System.out.println("请输入命令：");
        System.out.println("推出请输入：exit");
        CommandReceiver commandReceiver = new CommandReceiver();
        String commandString;
        do {
            commandString = commandReceiver.getCommand();
            System.out.println("命令是" + commandString);
        } while (!commandString.equals("exit"));

        System.out.println("结束");
    }

}
