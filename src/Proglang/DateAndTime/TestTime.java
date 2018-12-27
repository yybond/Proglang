package Proglang.DateAndTime;

import java.util.*;
import java.text.*;

public class TestTime {
    public static void main(String[] args) {

        Date date = new Date(); // Инициализация объекта date
        System.out.println(date.toString());    // Вывод текущей даты и времени с использованием toString()

        // Форматирование даты с помощью printf
        String str = String.format("Текущая дата и время: %tc \n", date);
        System.out.printf(str);

        // SimpleDateFormat — это конкретный класс для парсинга и форматирования даты в Java.
        // SimpleDateFormat позволяет начать с выбора любых пользовательских шаблонов для форматирования даты и времени.
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));

        // Замораживает весь поток на 10 секунд
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000);
            System.out.println(new Date() + "\n");
        } catch (Exception e){
            System.out.println("Получили исключение!");
        }

        //Время выполнения программы
        //Начало
        long start = System.currentTimeMillis();

        //Код программы. Получение 10 случайных чисел от 0 до 9 и вывод на экран
        for (int i = 1; i <=10; i++){
            System.out.println("Случайное число №" + i + ": " + (int)(Math.random() * 10));
        }

        //Получение и запись в переменную timeWorkCode времени работы программы
        long timeWorkCode = System.currentTimeMillis() - start;

        //Вывод времени выполнения работы кода на экран
        System.out.println("Скорост ьвыполнения программы: " + timeWorkCode + " миллисекунд" );

    }
}
