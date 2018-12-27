package Proglang.Numbers;

// Метод Math.random() — в Java используется для генерации случайного числа в диапазоне от 0.0 до 1.0.
// Различные диапазоны могут быть достигнуты с помощью арифметики.

import java.sql.SQLOutput;

public class MathRandom {
    public static void main(String[] args) {
        System.out.println("1-ое случайное число: " + Math.random());
        System.out.println("2-ое случайное число: " + Math.random());
        System.out.println("3-ое случайное число: " + Math.random());

        System.out.println("Случайные числа от 0 до 10");
        int a = 0;  //От
        int b = 10; //До

        int random_number1 = a + (int) (Math.random() * b);
        System.out.println("1-ое случайное число: " + random_number1);

        int random_number2 = a + (int) (Math.random() * b);
        System.out.println("2-ое случайное число: " + random_number2);

        int random_number3 = a + (int) (Math.random() * b);
        System.out.println("3-ое случайное число: " + random_number3);

    }
}
