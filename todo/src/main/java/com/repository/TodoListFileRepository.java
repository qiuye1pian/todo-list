package com.repository;

import com.google.gson.Gson;
import com.todo.list.TodoList;
import org.apache.commons.lang.StringUtils;

import java.io.*;


public class TodoListFileRepository implements IRepository {

    private Gson gson = new Gson();

    private File file;

    public TodoListFileRepository(String filePath) throws IOException {
        file = new File(filePath);
        if (file.exists()) {
            return;
        }
        if (
                file.createNewFile()) {
            throw new IOException("");
        }
    }

    @Override
    public TodoList getTodoList() {
        String json = loadJsonFromFile();
        if (StringUtils.isNotEmpty(json)) {
            return gson.fromJson(json, TodoList.class);
        } else {
            return new TodoList();
        }
    }

    private String loadJsonFromFile() {
        try (FileInputStream fileInputStream = new FileInputStream(this.file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {

            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return StringUtils.EMPTY;
        }
    }


    @Override
    public void saveTodoList(TodoList todoList) {
        try(FileWriter fileWriter = new FileWriter(this.file);){
            fileWriter.write(gson.toJson(todoList));
            fileWriter.flush();
        }catch (IOException ignored){
        }
    }
}
