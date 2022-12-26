package exeption_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExeption {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");

        FileReader fileReader = new FileReader(file);
    }
}
