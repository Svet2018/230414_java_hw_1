package hw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Код для решения задания №1

       System.out.println("1.1. Решение задачи на треугольное число: ");
       System.out.println("Введите число n для вычисления n-ого треугольного числа: ");
       int num = Homework_1.inMetod();
       Homework_1.nTry(num);
       System.out.println();

       System.out.println("1.2. Решение задачи на факториал: ");
       System.out.println("Введите число n для вычисления факторила числа: ");
       int number = Homework_1.inMetod();
       Homework_1.func(number);
       System.out.println();

       System.out.println("1.3. Решение задачи на простые числа от 1 до 1000: ");
       Homework_1.printArrList(Homework_1.newList(1000));
       System.out.println();

       System.out.println("1.4. Решение задачи на реализацию простого калькулятора: ");
       System.out.print("Введите первое число: ");
       int num_1 = Homework_1.inMetod();
       System.out.print("Введите второе число: ");
       int num_2 = Homework_1.inMetod();
       int c = Homework_1.sign();
       if (c == 1) Homework_1.summa(num_1, num_2);
       else if (c == 2) Homework_1.power(num_1, num_2);
       else if (c == 3) Homework_1.diff(num_1, num_2);
       else if (c == 4) Homework_1.div(num_1, num_2);

        //Код для решения задания №2
       System.out.println();
       System.out.println("2. Задано уравнение вида q + w = e, q, w, e >= 0. Требуется восстановить выражение до верного равенства.");
       int numSum = Homework_2.numGenerate(100);
       String term_1 = Homework_2.termGenerate();
       String term_2 = Homework_2.termGenerate();
       Homework_2.printEquation(term_1, term_2, numSum);
       System.out.println();
       System.out.println("Предположительно возможные числа первого слагаемого: ");
       List<Integer> list_1 = Homework_2.printResalt(term_1);
       System.out.println();
       System.out.println("Предположительно возможные числа второго слагаемого: ");
       List<Integer> list_2 =Homework_2.printResalt(term_2);
       System.out.println();
       Homework_2.listInt((ArrayList) list_1, (ArrayList) list_2, numSum);

//        Код для решения задания №3
       System.out.print("Введите количество элементов массива: ");
       int countArr = Homework_3.inMetod();
       int [] arr = Homework_3.inArr(countArr);
       System.out.println();
       System.out.println("Создан массив чисел: ");
       Homework_3.printArr(arr);
       System.out.println();
       System.out.print("Сумма элементов массива с чётными индексами равна: ");
       Homework_3.printSummEven(arr);
       System.out.println();


        //Код для решения задания №4

        System.out.println("Сгенерирован список случайных чисел: ");
        int number = Homework_4.numGen();
        List<Integer> list = Homework_4.list(number);
        Homework_4.printRes((ArrayList) list);

    }

}
