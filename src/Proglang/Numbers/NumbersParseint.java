package Proglang.Numbers;

///Метод parseInt() — в Java используется для получения примитивного типа данных определенной строки, другими словами — преобразует строку в число.

public class NumbersParseint {
    public static void main(String[] args) {

        int x = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444", 16); //1092 в шестнадцатеричной системе счисления444

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
    }
}
