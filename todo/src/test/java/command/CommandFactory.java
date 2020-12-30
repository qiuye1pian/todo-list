package command;

public class CommandFactory {
    public static Command createCommand(String inputCommandString) {
        return new Command("add");
    }

}
