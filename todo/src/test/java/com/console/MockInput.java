package com.console;

import java.util.ArrayList;
import java.util.List;

public class MockInput implements Input {

    private List<String> inputList = new ArrayList<>();

    private int currentInputIndex = 0;

    @Override
    public String getUserInput() {
        return inputList.get(currentInputIndex++);
    }

    public void appendInput(String s) {
        inputList.add(s);
    }
}
