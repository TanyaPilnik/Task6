package Lesson2;
import java.util.Scanner;
public class task9{
    public static void main(String[] args) {
            Scanner a = new Scanner(System.in);;
            System.out.println("Enter the size");
            int size = a.nextInt();
            for (int j = 0; j < (size - 1); j++)
                System.out.print(" ");
            System.out.println("*");

            for (int j = 1; j < (size - 1); j++)
            {
                for (int k = 0; k < (size - 1 - j); k++)
                    System.out.print(" ");
                System.out.print("*");
                for (int m = 0; m < 2*j-1; m++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int j = 0; j < size ; j++)
                System.out.print("* ");
            System.out.println(" ");

        }
    }