package ru.itis.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordsReader {

    private String fileName;
    private BufferedReader fileReader;
    private int k;

    public WordsReader(String fileName) {
        this.fileName = fileName;
        try {
            this.fileReader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<String> readArray(){
        List<String> words = new ArrayList<>();
        try {
            k = Integer.parseInt(fileReader.readLine());
            String readedWord = fileReader.readLine();
            while (readedWord != null){
                if (readedWord.length() >= k) {
                    words.add(readedWord);
                }
                readedWord = fileReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }

    public int getK() {
        return k;
    }
}
