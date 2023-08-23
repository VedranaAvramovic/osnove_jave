package d21_08_2023;

import org.example.Main;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int N = s.nextInt();

        int suma = 0;

        for (int i = 0; i < N; i++){
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj >= 100 && broj <= 999){
                suma = suma + broj;

            }

        }

        System.out.println("Suma je " + suma);

    }
}
