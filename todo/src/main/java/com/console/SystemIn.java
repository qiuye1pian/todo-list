package com.console;

import org.apache.commons.lang.StringUtils;

import java.util.Scanner;

public class SystemIn implements Input{

    private Scanner scan = new Scanner(System.in);

    @Override
    public String getUserInput(){
        return StringUtils.trim(scan.nextLine());
    }

}
