package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[50];
        int b = 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = b;
            b += 2;
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
}