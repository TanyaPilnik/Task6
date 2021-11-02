package Lesson3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int a=0;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(10);
            System.out.print(array[i] + " ");
        }
        for(int i=0; i<array.length-1; i++) {
            if(array[i]>array[i+1]) {
                a = 1;
                break;
            }
        }
        if(a==1) {
            System.out.println("Последовательность не является строго возрастающей");
        } else {
            System.out.println("Последовательность является строго возрастающей");
        }
    }
}