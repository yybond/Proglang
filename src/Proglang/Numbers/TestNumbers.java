package Proglang.Numbers;

public class TestNumbers {
    public static void main(String[] args) {
        Integer x = 5;

        System.out.println("Метод xxxValue():");
        //Преобразовывает int в byte и возвращает примитивный тип данных byte
        System.out.println(x.byteValue());
        //Преобразовывает int в double и возвращает примитивный тип данных byte
        System.out.println(x.doubleValue());
        //Преобразовывает int в long и возвращает примитивный тип данных byte
        System.out.println(x.longValue());


        System.out.println("Метод compareTo():");
        //Метод compareTo() — сравнивает числовой объект, который вызывает метод, с аргументом.
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));

    }
}
