package Lesson2;
public class task8 {
    public static void main(String[] args) {
        int c = 4;
        for (int i = 0; i < c; i++) {
            for (int a = 0; a < c; a++) {
                if (a < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
