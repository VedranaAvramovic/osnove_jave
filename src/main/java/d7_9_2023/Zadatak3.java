package d7_9_2023;

public class Zadatak3 {

    public static void main(String[] args) {

            //Zadatak 3: Kreiranje klase "Proizvod"
            //Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.

            Proizvod a = new Proizvod();
            a.naziv = "Meso";
            a.cena = 200;

            Proizvod b = new Proizvod();
            b.naziv = "Voce";
            b.cena = 100;

            Proizvod c = new Proizvod();
            c.naziv = "Mleko";
            c.cena = 70;

            System.out.println("Proizvod: " + a.naziv + ", cena: " + a.cena);
            System.out.println("Proizvod: " + b.naziv + ", cena: " + b.cena);
            System.out.println("Proizvod: " + c.naziv + ", cena: " + c.cena);

    }
}
