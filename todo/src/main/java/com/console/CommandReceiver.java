package com.console;

import java.util.Scanner;

public class CommandReceiver {

    private Scanner scan = new Scanner(System.in);

    public String getCommand(){
        return scan.next();
    }

}
