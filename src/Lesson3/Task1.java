package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            a[i] = b;
            b += 2;
            i++;
        }
        for (i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}