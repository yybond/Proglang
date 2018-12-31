package Proglang.Stream;

import java.io.*;

public class FileWriteRead {
    public static void main(String[] args) throws Exception {
        File file = new File("temp.txt");
        if (!file.exists()){            //Если директориии нету мы ее создаем
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        char[] chars = new char[20];
        fileReader.read(chars);
        System.out.println(chars);

    }
}
