package command;

import org.apache.commons.lang.StringUtils;

public class CommandFactory {
    public static CommandBase createCommand(String inputCommandString) {
        return new AddItem(pickupText(split(inputCommandString)[2]));
    }

    private static String pickupText(String itemText) {
        return StringUtils.substring(itemText, 1, itemText.length() - 1);
    }

    private static String[] split(String commandString) {
        return StringUtils.split(commandString, " ");
    }

}
