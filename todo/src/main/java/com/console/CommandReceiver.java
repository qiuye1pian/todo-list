package com.console;

import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

public class CommandReceiver implements Input{

    private Scanner scan = new Scanner(System.in);

    @Override
    public String getCommandString(){
        return StringUtils.trim(scan.next());
    }

}
