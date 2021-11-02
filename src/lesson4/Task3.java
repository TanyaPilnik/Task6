package lesson4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] newArr = twoDimensionalArrayGenerator(4, 9);
        print2DArray(newArr, "-------------", " | ");
        printMainDiag(newArr);
        printSecondDiag(newArr);
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
        int mult2 = 1;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (i == j) {
                    mult2 *= newArr[i][j];
                }
            }
        }
        System.out.println(mult2);
    }

    public static void printSecondDiag(int[][] newArr) {
        int n = 4;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (n - i - 1 == j) {
                    System.out.printf("%s", newArr[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        int mult2 = 1;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (i == j) {
                    mult2 *= newArr[i][j];
                }
            }
        }
        System.out.println(mult2);
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
