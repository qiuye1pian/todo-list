package com.console;

import java.util.Scanner;

public class CommandReceiver implements Input{

    private Scanner scan = new Scanner(System.in);

    @Override
    public String getCommand(){
        return scan.next();
    }

}
