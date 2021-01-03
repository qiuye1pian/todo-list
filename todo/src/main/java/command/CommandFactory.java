package command;

import org.apache.commons.lang.StringUtils;

public class CommandFactory {

    private CommandFactory() {

    }

    public static CommandBase createCommand(String inputCommandString) {
        if ("exit".equalsIgnoreCase(split(inputCommandString)[0])) {
            return new Exit();
        }
        switch (split(inputCommandString)[1]) {
            case "addNewItem":
                return new Add(pickupText(split(inputCommandString)[2]));
            case "done":
                return new Done(pickupText(split(inputCommandString)[2]));
            default:
                return new Unknown();
        }
    }

    private static String pickupText(String itemText) {
        return StringUtils.substring(itemText, 1, itemText.length() - 1);
    }

    private static String[] split(String commandString) {
        return StringUtils.split(commandString, " ");
    }

}
