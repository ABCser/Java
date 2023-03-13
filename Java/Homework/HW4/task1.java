package Homework.HW4;

import java.util.Arrays;
import java.util.LinkedList;

/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
 */
public class task1 {
    public static void main(String[] args) {
        LinkedList<Object> newList = new LinkedList<>(Arrays.asList("Марс", 6.66, 128500, "Венера", 17, "Jupiter"));
        System.out.println(newList);
        System.out.println(reverseList(newList));
    }

    public static Object reverseList (LinkedList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(list.size() - i, list.get(0));
            list.remove();
        }
        return list;
    }
}
