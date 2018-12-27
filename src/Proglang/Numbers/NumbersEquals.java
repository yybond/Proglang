package Proglang.Numbers;

// В Java equals() возвращает истину (true), если аргумент не имеет нулевого значения (null),
// является объектом того же типа и с тем же числовым значением.

public class NumbersEquals {
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        short a = 5;

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));
    }
}
