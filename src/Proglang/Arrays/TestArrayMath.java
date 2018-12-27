package Proglang.Arrays;

public class TestArrayMath {
    public static void main(String[] args) {
        //Нахождение максимального элемента в массиве из 4 элементов типа double.
        double[] myArray = {11, 5.8, 11.1, 10.9};

        //Переменной max задаем минимальное double-значение.
        double max = Double.MIN_VALUE;

        //Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++){
            //Переменной max с помощью метода math.max() присваиваем максимальное значение
            //путем выбора наибольшего из двух значений("старого" значения max и значениея элемента).
            max = Math.max(max, myArray[i]);
        }
        //Выводим на экран наибольшее число массива myArray.
        System.out.println("Максимальный элемент в массиве myArray: " + max);


        double[] myArray1 = {11, 5.8, 11.1, 10.9};

        //Переменной задаем значение нулевого элемента.
        double max1 = myArray1[0];

        //Перебираем все элементы массива
        for (int i = 1; i < myArray1.length; i++){
            //Сравниваем значение переменной макс со значением элемента массива
            //Если значенеи элемента массива больше значения переменной макс
            //то новое значение переменной макс будет равно значению этого элемента
            if (myArray1[i] > max1){
                max1 = myArray1[i];
            }
        }
        System.out.println("Максимальное значение в массиве 2: " + max1);


        double[] myList = {2.5, 1.8, 1.3, 6.5, 22.8};

        double total = 0;

        //Прибавляем к переменной total каждый элемент массива.
        for (int i = 0; i < myList.length; i++){
            total += myList[i];
        }

        //Вывод результата на экран
        System.out.println("Сумма эллементов массива myList: " + total);

        double totalNew = 0;

        for(double element : myList){
            totalNew += element;
        }

        System.out.println(totalNew);
    }
}
