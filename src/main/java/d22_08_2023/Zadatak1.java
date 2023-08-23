package d22_08_2023;

import java.util.Scanner;

//        1.	Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
//        Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        boolean uslov = true;
        int suma = 0;
        while (uslov) {
            System.out.print("Unesite vrednost: ");
            int n = s.nextInt();

            if (suma + n <= 100){
                suma = suma + n;
            }
            else
                uslov = false;
        }
        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma);

    }
}
