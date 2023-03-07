package Homework.HW2;
//3*(дополнительно). К калькулятору из предыдущего дз добавить логирование.

import Homework.HW1.task3;
import java.io.FileWriter;
import java.util.Scanner;

public class task3_calc {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        operator = reader.next().charAt(0);
        System.out.print("Введите второе число: ");
        num2 = reader.nextDouble();
        reader.close();
        System.out.println(task3.calculate(num1, num2, operator));
        logging(task3.calculate(num1, num2, operator));
    }
    public static void logging(String result) {
        try {
            FileWriter file = new FileWriter("Java/Homework/HW2/calc_log.txt", true);
            file.write(result);
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}