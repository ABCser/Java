package sem1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println(("What is your name?"));
        String name1 = name.nextLine();
        System.out.println("Hello, " + name1 + "!");
        name.close();
    }
}
