package command;

import org.apache.commons.lang.StringUtils;

public class CommandFactory {

    private CommandFactory() {

    }

    public static CommandBase createCommand(String inputCommandString) {
        if ("exit".equalsIgnoreCase(split(inputCommandString)[0])) {
            return new Exit();
        }
        return new Add(pickupText(split(inputCommandString)[2]));
    }

    private static String pickupText(String itemText) {
        return StringUtils.substring(itemText, 1, itemText.length() - 1);
    }

    private static String[] split(String commandString) {
        return StringUtils.split(commandString, " ");
    }

}
