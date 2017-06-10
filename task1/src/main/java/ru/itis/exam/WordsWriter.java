package ru.itis.exam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WordsWriter {

    private String fileName;
    private BufferedWriter fileWriter;

    public WordsWriter(String fileName) {
        this.fileName = fileName;
        try {
            fileWriter = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeArray(List<String> array){
        array.forEach(word -> {
            try {
                fileWriter.write(word);
                fileWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        try {
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
