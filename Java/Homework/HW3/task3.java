package Homework.HW3;
/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            myList.add(new Random().nextInt(0, 100));
        }
        System.out.println(myList);
        int min = Collections.min(myList);
        int max = Collections.max(myList);
        double avg = myList.stream().mapToDouble(a -> a).sum() / myList.size();
        NumberFormat numFormat = new DecimalFormat("#.######");
        System.out.printf("Минимальное число: %d, Максимальное число: %d, Среднее арифметическое: %s\n", min, max, numFormat.format(avg));
    }
}