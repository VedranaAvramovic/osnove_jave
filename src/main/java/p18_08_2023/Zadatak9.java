package p18_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Uneti broj a");
        int a = s.nextInt();
        System.out.println("Uneti broj b");
        int b = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i != a && i != b) {
                System.out.println(i);
            }
        }
    }
}
