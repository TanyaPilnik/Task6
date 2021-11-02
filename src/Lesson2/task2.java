package Lesson2;
import java.util.Scanner;
public class task2 {
        public static void main(String[] args) {
            int a= 1;
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите количество часов: ");
            int b = scn.nextInt();
            for (int i = 0; i < b / 3; i++) {
                a *= 2;
            }
            System.out.printf("За %d часов получится %d амеб.", b, a);
        }
    }

