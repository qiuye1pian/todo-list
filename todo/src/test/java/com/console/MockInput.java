package com.console;

public class MockInput implements Input {


    private String input;

    @Override
    public String getUserInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
