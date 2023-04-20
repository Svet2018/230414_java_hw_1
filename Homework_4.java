package hw1;

import java.util.*;

public class Homework_4 {

    /* Task_7
Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.
Входные данные
Вводится список чисел. Все числа списка находятся на одной строке.
Выходные данные
Выведите ответ на задачу.
Sample Input:
6
1
2
2
3
3
3
Sample Output:
1
}*/

    //Метод генерирует случайный размер списка
    protected static int numGen(){
        Random random = new Random();
        int num = random.nextInt(0, 10);
        return num;
    }

    //Метод генерирует случайные числа списка
    protected static ArrayList list(int num){
        Random random = new Random();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < num; i++){
            numList.add(random.nextInt(2, 10));
        }
        return (ArrayList) numList;
    }

    protected static void printRes(ArrayList list){
        List<Integer> newList = list;
        List<Integer> newList2 = list;

        for (int n : newList){
            System.out.print(n + " ");
        }
        System.out.println("newList.size() " + newList.size());

        for (int i = 0; i < newList.size(); i++){
            int x = 0;
            System.out.println("(i) = " + newList.get(i) + "---------");
            x = newList.get(i);
            if (x == newList.get(i)) {
            newList2.add(newList.get(i));
            } break;
        }
        System.out.println(newList2);
    }

}






