package ru.itis.exam;

import java.util.List;

public class Application {


    public static void main(String[] args) {
        WordsReader reader = new WordsReader("src/main/resources/in.txt");
        List<String> words = reader.readArray();
        words.sort((o1, o2) -> {
            return o1.charAt(reader.getK() - 1) - o2.charAt(reader.getK() - 1);
        });
        WordsWriter writer = new WordsWriter("src/main/resources/out.txt");
        writer.writeArray(words);
    }

}