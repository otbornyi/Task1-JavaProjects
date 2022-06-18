package task2;
import java.util.Scanner;
import java.io.*;

public class task2 {

    static int getScannerNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер треугольного числа : ");
        try {
            int num = in.nextInt();
            return num;
        }
        catch (Exception e) {
            in.next();
            System.out.println("Вы ввели не цифру!");
        }
        return getScannerNumber();
    }

    public static void main(String[] args) {

        int n = getScannerNumber();
        int x = (n * (n + 1)) / 2;
        System.out.println(x);
    }
}
