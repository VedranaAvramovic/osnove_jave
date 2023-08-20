package p18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj N: ");
        int n = s.nextInt();

        System.out.println("Unesite operaciju: ");
        String operacija = s.next();

        if ("uvecaj".equals(operacija)) {
            n= n +1;
        }
        if ("smanji".equals(operacija)) {
            n=n-1;
        }

        System.out.println("Nova vrednost za n je " + n);
    }
}
