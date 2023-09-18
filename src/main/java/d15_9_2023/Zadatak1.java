package d15_9_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera,
// na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.


        Igrac igrac1 = new Igrac("Janko Jankovic", "3663636325226", 1999, 2, "napadac", true);
        Igrac igrac2 = new Igrac("Steva Stevanovic", "2363636325226", 1998, 4, "golman", false);

        Trener trener1 = new Trener("Petar Petrovic", "7863636325226", 1979, 15, "kondicioni");
        Trener trener2 = new Trener("Marko Markovic", "8963636325226", 1995, 5, "pomocni");

        igrac1.stampaj();
        trener2.stampaj();

        Scanner s = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();

        System.out.println("Koliko igraca zelite da unesete: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite ime i prezime igraca: ");
            String ime = s.next();
            System.out.println("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.println("Unesite godinu rodjenja:");
            int godina = s.nextInt();
            System.out.println("Unesite broj koji igrac nosi:");
            int broj = s.nextInt();
            System.out.println("Unesite poziciju:");
            String pozicija = s.next();
            System.out.println("Da li je kapiten: ");
            String odgovor = s.next();

            boolean kapiten = false;
            if (odgovor.equals("da")) {
                kapiten = true;
            }

            igraci.add(new Igrac(ime, jmbg, godina, broj, pozicija, kapiten));
        }

        System.out.println("Koliko trenera zelite da unesete: ");
        int m = s.nextInt();

        for (int i = 0; i < m; i++) {

            System.out.println("Unesite ime i prezime trenera: ");
            String ime = s.next();
            System.out.println("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.println("Unesite godinu rodjenja:");
            int godina = s.nextInt();
            System.out.println("Unesite godine iskustva:");
            int iskustvo = s.nextInt();
            System.out.println("Unesite tip:");
            String tip = s.next();

            treneri.add(new Trener(ime, jmbg, godina, iskustvo, tip));
        }

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
        }
        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }
    }
}
