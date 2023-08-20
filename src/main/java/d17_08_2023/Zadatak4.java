package d17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

        System.out.print("Unesite x za T1: ");
        int xT1 = s.nextInt();

        System.out.print("Unesite y za T1: ");
        int yT1 = s.nextInt();

        System.out.print("Unesite x za T2: ");
        int xT2 = s.nextInt();

        System.out.print("Unesite y za T2: ");
        int yT2 = s.nextInt();

        System.out.print("Unestie x za M: ");
        int xM = s.nextInt();

        System.out.print("Unesite y za M: ");
        int yM = s.nextInt();
    }
}
