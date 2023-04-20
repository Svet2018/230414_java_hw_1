package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework_2 {

    /*
    2.Задано уравнение вида q + w = e, q, w, e >= 0.
    Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
    Требуется восстановить выражение до верного равенства.
    Предложить хотя бы одно решение или сообщить, что его нет.*/


    //Метод генерирует случайное число (сумму в уравнении)
    protected static int numGenerate(int n){
        Random random = new Random();
        int num = random.nextInt(0, n);
        //System.out.println(num);
        return num;
    }

    //Метод генерирует слагаемое
    protected static String termGenerate(){
        int term = numGenerate(10);
        String s = "?";
        int rank = numGenerate(2);
        if (rank == 1){
            s = s + term;
        }else s = term + s;
        return s;
    }

    //Метод выводит на экран уравнение, которое необходимо решить
    protected static void printEquation(String str_1, String str_2, int num){
        System.out.println("Дано уравнение:");
        System.out.println(str_2 + " + " + str_1 + " = " + num);
        System.out.println("Восстановите выражение до верного равенства.\n" +
                "Предложите хотя бы одно решение или сообщите, что его нет.");
    }

    //Метод печатает возможное слагаемое
    protected static ArrayList<Integer> printResalt(String str){
        String newString_1 = str;
        ArrayList<Integer> list = new ArrayList<>();
        String ss = "";
        for (int i = 0; i < 10; i++){
            String ii = Integer.toString(i);
            char s = ii.charAt(0);
            ss = newString_1.replace('?', s) + " ";
            list.add(Integer.valueOf(ss.trim()));
            System.out.print(ss);
        }
        return list;
    }

    protected static void listInt(ArrayList list_1, ArrayList list_2, int sum){
        ArrayList<Integer> newList_1 = new ArrayList<>();
        ArrayList<Integer> newList_2 = new ArrayList<>();
        String s = "";
        for (int i = 0; i <= list_1.size(); i++){
            newList_1.add(sum - ((Integer) list_1.get(i)));
            for (int j = 1; j <=  list_1.size(); j++) {
                newList_2.add(sum - ((Integer) list_2.get(i)));
                if (newList_1.get(i) + newList_2.get(j) == sum){
                    s = "Возможное уравнение: ";
                    System.out.println(s);
                    System.out.println(newList_1.get(i) + " + " + newList_2.get(j) + " = " + sum);
                } else break;

            }
        }
        if (s.equals("")) System.out.println("Решения нет");

    }


}
