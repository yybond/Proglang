package Proglang.Arrays;

public class TestArray2 {
    public static void main(String[] args) {

        //Создание массивов типа int и объявление переменных
        int[] myArrayInt1;
        int myArrayInt2[];


        //Определение массива или выделение памяти
        //Массив 3 из 10 'ktvtynjd c yfxfkmysv pyfxtybt 0 lkz rf;ljuj 'ktvtynf
        int[] myArrayInt3;
        myArrayInt3 = new int[10];

        //Массив 4 из 20 элементов с начальным значением 0 для каждого элемента
        int[] myArrayInt4 = new int[20];


        //Инициализаци массива
        //Массив 5 из 5 элементов со значениями
        int[] myArrayInt5 = {1, 3, 8, 10, 4};

        //Массив 6 из 10 элементов с начальным значением 0 для каждого элемента
        int[] myArrayInt6 = new int[10];
        //Присвоение второму элементу myArrayInt6 значения 14
        myArrayInt6[2] = 14;
        //Присвоение пятому элементу myArrayInt6 значения 8
        myArrayInt6[5] = 8;


        double[] myArray7 = {2.4, 3.8, 11.2, 9.8, 1.18};
        System.out.println("Количество элементов 7-го массива: " + myArray7.length);

        String[] myArray8 = {"Java", "массив", "пример", "proglan.su"};
        System.out.println("Количество элементов 8-го массива: " + myArray8.length);
    }
}
