package d21_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();


        double agresivnih = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite tekst: ");
            String tekst = s.next();

            if (tekst.contains("!")) {
                agresivnih = agresivnih + 1;
                System.out.println(tekst);
            } else {
                System.out.println(tekst + "!");
            }
        }

        double agresivnost = (agresivnih / n) * 100;
        System.out.println("Nivo agresivnosti " + agresivnost + ".");
    }
}
