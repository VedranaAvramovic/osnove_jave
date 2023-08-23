package d22_08_2023;

import java.util.Scanner;

//	Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =.
//	Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//            Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//            Primer izvrsenja:
//            Unos: (
//            Unos: 2
//            Unos: *
//            Unos: (
//            Unos: 1
//            Unos: +
//            Unos: 3
//            Unos: )
//            Unos: )
//            Unos: =
//            Zagrade su uparene
//            (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//            Primer izvrsenja 2:
//            Unos: (
//            Unos: 2
//            Unos: *
//            Unos: (
//            Unos: 1
//            Unos: +
//            Unos: 3
//            Unos: )
//            Unos: =
//            Zagrade nisu uparene
//            (Objasnjenje: fali poslednja zagrada iz formule)



public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int otvorena = 0, zatvorena = 0;
        String karakter = "";

        while (!karakter.equals("=")) {
            System.out.println("Unos: ");
            karakter = s.next();

            if (karakter.equals("("))
                otvorena = otvorena + 1;
            else if (karakter.equals(")"))
                zatvorena = zatvorena + 1;
        }
        if (zatvorena==otvorena)
            System.out.println("Zagarade su uparene");
        else
            System.out.println("Zagarade nisu uparene");
    }
}
