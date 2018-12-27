package Proglang.Arrays;

public class ArrayDisplay {
    public static void main(String[] args) {
        double[] myList = {11.5, 1.9, 5.32, 8.8, 15.8};

        //Вывод массива на экран с помощью улучшенного цикла for
        System.out.print("Вывод элементов массива myList: ");
        for (double element : myList){
            System.out.print(element + ", ");
        }

        //Вывод элементов массива на экран
        System.out.print("\nВывод элементов массива myList: ");
        for (int i = 0; i < myList.length; i++){
            System.out.print(myList[i] + ", ");
        }

        double[] myList1 = {2, 2.7, 3, 12, 23.8};

        System.out.print("\nЧетные элементы массива myList1: ");
        for (int i = 0; i < myList1.length; i++){
            if(myList1[i]%2 == 0){
                System.out.print(myList1[i] + ", ");
            }
        }

        System.out.print("\nНечетные элементы массива myList1: ");
        for (int i = 0; i < myList1.length; i++){
            if (myList1[i]%2 != 0){
                System.out.print(myList1[i] + ", ");
            }
        }
    }
}
