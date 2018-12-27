package Proglang.Characters;

public class CharIsDigit {
    public static void main(String[] args) {
        System.out.println("Значение \"1\" цифра? Ответ: " + Character.isDigit('1'));
        System.out.println("Значение \"0\" цифра? Ответ: " + Character.isDigit('0'));
        System.out.println("Значение \"p\" цифра? Ответ: " + Character.isDigit('p'));
        System.out.println("Значение \"!\" цифра? Ответ: " + Character.isDigit('!'));
        System.out.println("Значение \"&\" цифра? Ответ: " + Character.isDigit('&'));
    }
}
