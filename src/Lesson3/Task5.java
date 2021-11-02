package Lesson3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array.length; i++) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(15);
            System.out.print(array[i] + " ");
            System.out.print(array2[i] + " ");
        }
        double average1 = 0;
        double average2 = 0;
        for (int j = 0; j < 5; j++) {
            average1 += array[j];
            average2 += array2[j];
        }
        average1 /= 5;
        average2 /= 5;

        if (average1 > average1) {
            System.out.println("Среднее арифметическое первого массива (" + average1 + ") больше среднего арифметического " +
                    "второго массива (" + average2 + ")");
        } else if (average1 < average2) {
            System.out.println("Среднее арифметическое первого массива (" + average1 + ") меньше среднего арифметического " +
                    "второго массива (" + average2 + ")");
        } else {
            System.out.println("Средние арифметические массивов равны (" + average1 + ")");
        }
    }
}