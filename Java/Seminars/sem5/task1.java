package sem3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println(("Name is "));
        String name1 = name.nextLine();
        name.close();
        System.out.println("Hello, " + name);
    }
}

