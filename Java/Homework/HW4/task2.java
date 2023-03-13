package Homework.HW4;

import java.util.Arrays;
import java.util.LinkedList;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class task2 {
    public static void main(String[] args) {
        LinkedList<Object> newList = new LinkedList<>(Arrays.asList("Марс", 6.66, 128500, "Венера", 17, "Jupiter"));
        System.out.println(newList);
        System.out.println();

        System.out.println("Помещаем элемент (\"Новый элемент\") в конец очереди:");
        enqueue(newList, "Новый элемент");
        System.out.println(newList);
        System.out.println();

        System.out.println("Возвращаем первый элемент из очереди и удаляем его:");
        System.out.println(dequeue(newList));
        System.out.println(newList);
        System.out.println();

        System.out.println("Возвращаем первый элемент из очереди, не удаляя:");
        System.out.println(first(newList));
        System.out.println(newList);
    }

    public static Object enqueue(LinkedList<Object> list, Object element) {
        return list.offer(element);
    }

    public static Object dequeue(LinkedList<Object> list) {
        return list.poll();
    }

    public static Object first(LinkedList<Object> list) {
        return list.peek();
    }
}
