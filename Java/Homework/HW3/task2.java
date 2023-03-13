package Homework.HW3;
/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            myList.add(new Random().nextInt(0, 100));
        }
        System.out.println(myList);
        for (int i = myList.size() - 1; i >= 0; i--) {
            if (myList.get(i) % 2 == 0) {
                myList.remove(i);
            }
        }
        System.out.println(myList);
    }

}