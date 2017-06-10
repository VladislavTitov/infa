package ru.itis.exam;

import java.util.List;

/**
 * Created by VladislavTitov on 08.06.2017.
 */
public class Application {


    public static void main(String[] args) {
        NumberListReader reader = new NumberListReader("E:\\Programming\\abb\\TestChat\\task1\\src\\main\\resources\\in.txt");
        List<Integer> numbers = reader.readArray();
        numbers.sort((o1, o2) -> {
            while (o1 != 0 & o2 != 0){
                o1 /= 10;
                o2 /= 10;
            }
            if (o1 == 0 & o2 != 0){
                return -1;
            }else if (o1 == 0 & o2 == 0){
                return 0;
            }else {
                return 1;
            }

        });
        NumberListWriter writer = new NumberListWriter("E:\\Programming\\abb\\TestChat\\task1\\src\\main\\resources\\out.txt");
        writer.writeArray(numbers);
    }

}
