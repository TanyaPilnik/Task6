package lesson4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[][] newArr = twoDimensionalArrayGenerator(4, 9);
        print2DArray(newArr, "-------------", " | ");
        printMainDiag(newArr);
    }
    public static void printMainDiag(int[][] newArr) {
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (i == j) {
                    System.out.printf("%s ", newArr[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        int summ = 0;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (i == j && newArr[i][j] % 2 == 0) {
                    summ += newArr[i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов:" + summ);
    }
    public static int[][] twoDimensionalArrayGenerator(int arrayLength, int valueSize) {
        int[][] arr2 = new int[arrayLength][];
        for (int i = 0; i < arrayLength; i++) {
            int[] arr = arrayGenerator(arrayLength, valueSize);
            arr2[i] = arr;
        }
        return arr2;
    }
    public static int[] arrayGenerator(int arrayLength, int valueSize) {
        Random randomizer = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = randomizer.nextInt(valueSize);
        }
        return array;
    }
    private static void printArray(int[] arrayInt, String separator) {
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                separator = "";
            }
            System.out.print(arrayInt[i] + separator);
        }
        System.out.println();
    }
    public static void print2DArray(int[][] arr, String rowSeparator, String cellSeparator) {
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i], cellSeparator);
            if (i != arr.length - 1) {
                System.out.println(rowSeparator);
            }
        }
    }
}
