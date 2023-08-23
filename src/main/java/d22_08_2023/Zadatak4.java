package d22_08_2023;

import java.util.Scanner;

//4.	Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:1
//        Unesite broj:3
//        Unesite broj:1
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto tri jedinice)


public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int dvojke = 0, jedinice = 0;

        while (dvojke < 2 && jedinice < 3) {
            System.out.println("Unesite broj: ");
            int n = s.nextInt();
            if (n == 2)
                dvojke = dvojke + 1;
            if (n == 1)
                jedinice = jedinice + 1;

        }
        System.out.println("Kraj programa");
    }
}

