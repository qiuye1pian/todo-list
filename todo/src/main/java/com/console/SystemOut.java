package com.console;

public class SystemOut implements Output {

    @Override
    public void println(String text) {
        System.out.println(text);
    }

}
