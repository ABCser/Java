package Seminars.sem2;
/*
чтение файла посимвольно
*/
import java.io.FileReader;

public class task5 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        try {
            FileReader file01 = new FileReader("Java/Seminars/sem2/test.txt");
            int symbol;
            while ((symbol = file01.read()) != -1) {
                result.append((char) symbol);
            }
            file01.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(result);
    }
}

