package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\org\\example\\file.json");
        Charset encoding = StandardCharsets.UTF_8;

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = JsonParser.parseString(Files.readString(path, encoding));
        String prettyJsonString = gson.toJson(je);
        System.out.println(prettyJsonString);
    }
}