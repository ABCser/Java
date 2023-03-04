package Homework.HW1;
//Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> simple_num = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            int flag = 1;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                simple_num.add(i);
            }
        }
        System.out.println("Простые числа от 1 до 1000: \n" + simple_num);
    }
}