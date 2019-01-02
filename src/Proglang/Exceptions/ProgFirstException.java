package Proglang.Exceptions;

import java.io.File;
import java.io.FileReader;


public class ProgFirstException {

    public static void main(String[] args) {
        File f = new File("D://java//file.txt");

        //Checked - Контролируемое исключение
        //FileReader fr = new FileReader(f);

        //Unchecked - Неконтролируемое исключение
        int array[] = {1, 2, 3};
        System.out.println(array[4]);

    }
}
