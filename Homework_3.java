package hw1;

import java.util.Scanner;

public class Homework_3{
/*
Вводится массив (сначала количество элементов, потом сами элементы).
Найдите сумму его элементов с чётными индексами и выведите её.
А потом выведите числа, которые суммировались.
    Sample Input:
            4
            1
            2
            3
            4
    Sample Output:
            4
            1
            3
*/

    //Метод введения числа пользователя
    protected static int inMetod(){
        Scanner scanner = new Scanner(System.in);
        int  num = scanner.nextInt();
        return num;
    }

    //Метод введения элементов массива
    protected static int[] inArr(int len){
        int [] arr;
        int arrLen = len;
        int sum = 1;
        arr = new int[arrLen];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrLen; i++) {
            System.out.print("Введите " + sum + " элемент массива: ");
            int num = scanner.nextInt();
            arr[i] = num;
            sum++;
        }
        return arr;
    }

    //Метод печати массива
    protected static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Метод выводит сумму элементов массива с четными индексами и числа, которые суммировлись
    protected static void printSummEven(int [] arr) {
        int sum = 0;
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
                str = str + arr[i] + " ";
            }
        }
        System.out.print(sum);
        System.out.println();
        System.out.print("Вывод чисел, которые суммировались: " + str);
    }

}
