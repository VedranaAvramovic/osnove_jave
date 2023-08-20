package d17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

// 1.	Napisati program koji ima informacije koje ucitava informacije sa tastature:
// ●	Ime
// ●	Prezime
// ●	godinu rodjenja
// I stampa informaicije u formatu: [ime] [prezime] - [startost] god


        System.out.print("Unesite ime: ");
        String ime = s.next();

        System.out.print("Unesite prezime: ");
        String prezime = s.next();

        System.out.print("Unesite godinu rođenja: ");
        int godinaRodjenja = s.nextInt();

        int trenutnaGodina = 2023;
        int starost = trenutnaGodina - godinaRodjenja;

        System.out.println(ime + " " + prezime + " - " + starost + " god");




    }
}
