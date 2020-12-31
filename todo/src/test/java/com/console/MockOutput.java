package com.console;

public class MockOutput implements Output {

    private StringBuilder result = new StringBuilder();

    @Override
    public void println(String text) {
        this.result.append(text);
        this.result.append("\r\n");
    }

    public String getResult() {
        return result.toString();
    }
}
