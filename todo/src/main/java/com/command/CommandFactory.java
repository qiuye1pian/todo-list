package com.command;

import org.apache.commons.lang.StringUtils;

public class CommandFactory {

    private CommandFactory() {

    }

    public static CommandBase createCommand(String inputCommandString) {
        if ("exit".equalsIgnoreCase(split(inputCommandString)[0])) {
            return new Exit();
        }
        switch (split(inputCommandString)[1]) {
            case "add":
                return new Add(pickupText(split(inputCommandString)[2]));
            case "done":
                return new Done(pickupText(split(inputCommandString)[2]));
            case "list":
                return new Listing(pickupListingParameter(inputCommandString));
            default:
                return new Unknown();
        }
    }

    private static String pickupText(String itemText) {
        return StringUtils.substring(itemText, 1, itemText.length() - 1);
    }

    private static String pickupListingParameter(String inputCommandString) {
        String[] commandStringArray = split(inputCommandString);
        if (commandStringArray.length == 3) {
            return commandStringArray[2].replace("-", "");
        } else {
            return StringUtils.EMPTY;
        }
    }

    private static String[] split(String commandString) {
        return StringUtils.split(commandString, " ");
    }

}
