package Proglang.Stream;

import java.io.*;

public class CreateDirectory {
    public static void main(String[] args) {
        String nameDir = "C:\\Users\\Yevhenii.Bondarenko\\IdeaProjects\\HelloWorld\\tempz1\\proglang\\newdir";
        File a = new File(nameDir);

        a.mkdirs();

    }
}
