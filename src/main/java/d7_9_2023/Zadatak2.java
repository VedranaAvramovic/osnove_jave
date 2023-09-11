package d7_9_2023;

public class Zadatak2 {

    // Zadatak 2: Kreiranje klase "Automobil"
    //Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
    // U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

    public static void main(String[] args) {

        Automobil a = new Automobil();
        a.marka = "Mercedes";
        a.model = "CLS";
        a.godinaProizvodnje = 2012;

        Automobil b = new Automobil();
        b.marka = "Ford";
        b.model = "Focus";
        b.godinaProizvodnje = 2023;

        System.out.println("Automobil: " + a.marka + " " + a.model + ", Proizveden: " + a.godinaProizvodnje);
        System.out.println("Automobil: " + b.marka + " " + b.model + ", Proizveden: " + b.godinaProizvodnje);


    }
}
