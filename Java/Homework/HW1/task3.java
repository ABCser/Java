package Homework.HW1;

import java.util.Scanner;

//Реализовать простой калькулятор (+ - / *)
public class task3 {
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
        System.out.println(calculate(num1, num2, operator));
    }
    public static String calculate(double num1, double num2, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("Введен неверный оператор!");
        }
        String res = "\nРезультат вычисления:\n" + num1 + " " + operator + " " + num2 + " = " + result;
//        System.out.print("\nРезультат вычисления:\n");
//        System.out.printf(num1 + " " + operator + " " + num2 + " = " + result);
        return res;
    }
}