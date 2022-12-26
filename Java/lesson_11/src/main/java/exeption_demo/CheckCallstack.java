package exeption_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckCallstack {
    public static void main(String[] args) {
        methodThree();
    }

    public static void methodOne() throws FileNotFoundException {
        System.out.println("1");
        File file = new File("text.txt");
        FileReader fileReader = new FileReader(file);
    }

    public static void methodTwo() throws FileNotFoundException{
        System.out.println("2");
        methodOne();
    }

    public static void methodThree(){
        System.out.println("3");
        try {
            methodTwo();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
