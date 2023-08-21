package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");

        int N = s.nextInt();
        int suma = 0;

        for (int i = 0; i < N; i++); {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            suma = suma + broj;
        }

        System.out.println("Suma je " + suma);




    }
}
