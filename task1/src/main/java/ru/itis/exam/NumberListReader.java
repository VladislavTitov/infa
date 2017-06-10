package ru.itis.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by VladislavTitov on 08.06.2017.
 */
public class NumberListReader {

    private String fileName;
    private BufferedReader fileReader;

    public NumberListReader(String fileName) {
        this.fileName = fileName;
        try {
            this.fileReader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> readArray(){
        List<Integer> numbers = new ArrayList<Integer>();
        try {
            String readedNumber = fileReader.readLine();
            while (readedNumber != null){
                Integer number = Integer.parseInt(readedNumber);
                numbers.add(number);
                readedNumber = fileReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }


}
