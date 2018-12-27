package Proglang.Arrays;

public class TestArray {
    public static void main(String[] args) {
        double [] myList = {1.9, 2.9, 3.4, 3.5};

        //Вывести на экран все елементы массива
        for (int i=0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }

        //Сумма элементов массива
        double total = 0;
        for (int i = 0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("Сумма чисел массива: " + total);

        //Нахождение среди элементов массива наибольшего
        double max = myList[0];
        for (int i=1; i < myList.length; i++){
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Наибольший элемент массива: " + max);


        //Цикл foreach или расширенный цикл for позволяет последовательно пройти весь массив без использования индекса переменной.
        double[] myList2 = {1, 2, 3, 4, 5};

        for (double element: myList2){
            System.out.println(element);
        }


        //
    }
}
