package Proglang.Exceptions;

import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int array[] = new int[2];
            System.out.println("Доступ к третьему элементу: " + array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение: " + e);
        }
        System.out.println("Вне блока");
    }
}
