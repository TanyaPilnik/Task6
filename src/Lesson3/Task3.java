package Lesson3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int b = 0;
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(99);
            System.out.print(array[i] + " ");
            if (array[i] > 0 & array[i] % 2 == 0) b++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве " + b + " четных");
    }
}