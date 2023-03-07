package Homework.HW1;

import java.util.Scanner;

//Реализовать простой калькулятор (+ - / *)
public class task3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        operator = reader.next().charAt(0);
        System.out.print("Введите второе число: ");
        num2 = reader.nextDouble();

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
                return;
        }
        System.out.print("\nРезультат вычисления:\n");
        System.out.printf(num1 + " " + operator + " " + num2 + " = " + result);
    }
}