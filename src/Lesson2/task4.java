package Lesson2;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число А");
        int a = scn.nextInt();
        System.out.println("Введите число В");
        int b = scn.nextInt();
        int result = 0;
        for (int i = 0; i < a; i++) {
            result += b;
        }
        System.out.println(result);
    }
}
