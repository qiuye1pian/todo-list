package command;

import org.apache.commons.lang.StringUtils;

public class CommandFactory {
    public static CommandBase createCommand(String inputCommandString) {
        String[] list = split(inputCommandString);
        return new AddItem(pickupText(list[2]));
    }

    private static String pickupText(String s) {
        return StringUtils.substring(s, 1, s.length() - 1);
    }

    private static String[] split(String commandString) {
        return StringUtils.split(commandString, " ");
    }

}
