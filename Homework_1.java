package hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework_1 {


    /*
    1.1. Вычислить n-ое треугольного число (сумма чисел от 1 до n),
    1.2. n! (произведение чисел от 1 до n), Перейти по ссылке, реализовать формулу на Java.
    1.3. Вывести все простые числа от 1 до 1000
    1.4. Реализовать простой калькулятор
    Минимум -- > Условия + Цикл
    Введите число
    Введите число
    Выберите операцию
    1 - сложить
    2 - умножить...
*/

    //Вычисление треугольного числа
    //Метод введения числа пользователя
    protected static int inMetod(){
        Scanner scanner = new Scanner(System.in);
        int  num = scanner.nextInt();
        return num;
    }

    //Метод вычисления треугольного числа
    protected static void nTry(int n){
        System.out.println("Вы ввели число: " + n);
        System.out.print("Последовательность треугольных чисел от 1 до "  + n + " : ");
        int summ = 0;
        for (int i = 1; i <= n; i++) {
            summ = summ + i;
            System.out.print(summ + " ");
        }
        System.out.println();
        System.out.println("Ответ, n-ое треугольное число равно " + summ);
    }

    //Факториал
    //Метод вычисления факториала
    protected static void func(int num){
        int pow = 1;
        System.out.println("Последовательность чисел: ");
        for (int i = 1; i <= num; i++) {
            pow = pow * i;
            System.out.print(pow + " ");
        }
        System.out.println();
        System.out.println("Ответ, факториал равен " + pow);
    }

    //Простые числа
    // Метод проверяет числа на принадлежность к простым числам
    protected static boolean bool(int a) {
        int num = 2;
        while (a % num != 0 && num < a)
            num++;
        return (num == a);
    }

    //Метод вычисления простого числа
    protected static ArrayList newList(int a) {
        ArrayList<String> numList = new ArrayList<>(a);
        bool(a);
        for (int i = 1; i <= a; i++) {
            if (bool(i)) {
                numList.add(Integer.toString(i));
            }
        }
        return numList;
    }

    //Метод распечатывает список простых чисел
    protected static void printArrList(ArrayList list){
        System.out.println("Ответ список простых чисел: ");
        for (Object s : list){
            System.out.print(s + " ");
        }
    }

    //Калькулятор
    //Метод запрашивает у пользователя арифметичесоке действие
    protected static int sign() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое действие +, -, /, *: ");
        String sign = scanner.nextLine();
        return switch (sign) {
            case "+" -> 1;
            case "*" -> 2;
            case "-" -> 3;
            default -> 4;
        };
    }

    // Метод вычисляет сумму чисел
    protected static void summa(int num1, int num2) {
        int summ = num1 + num2;
        System.out.println("Вы ввели числа: " + num1 + " и " + num2);
        System.out.println("Сумма чисел: " + num1 + " + " + num2);
        System.out.println("Ответ: " + summ);
    }

    // Метод вычисляет произведение чисел
    protected static void power(int num1, int num2) {
        int pow = num1 * num2;
        System.out.println("Вы ввели числа: " + num1 + " и " + num2);
        System.out.println("Произведение чисел: " + num1 + " * " + num2);
        System.out.println("Ответ: " + pow);
    }

    // Метод ычисляет разность чисел
    protected static void diff(int num1, int num2) {
        int dif = num1 - num2;
        System.out.println("Вы ввели числа: " + num1 + " и " + num2);
        System.out.println("Разность чисел: " + num1 + " - " + num2);
        System.out.println("Ответ: " + dif);
    }

    // Метод вычисляет частное чисел
    protected static void div(double num1, double num2) {
        double div;
        System.out.println("Вы ввели числа: " + num1 + " и " + num2);
        if (num2 != 0) {
            div = num1 / num2;
            System.out.println("Деление чисел: " + num1 + " / " + num2);
            System.out.printf("Ответ: %.2f  ", div);
        } else
            System.out.println("На 0 делить нельзя!");
    }
}
