package ru.itis.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by VladislavTitov on 08.06.2017.
 */
public class NumberListWriter {

    private String fileName;
    private BufferedWriter fileWriter;

    public NumberListWriter(String fileName) {
        this.fileName = fileName;
        try {
            fileWriter = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeArray(List<Integer> array){
        array.forEach(number -> {
            try {
                fileWriter.write(String.valueOf(number));
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
