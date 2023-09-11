package d7_9_2023;

public class Zadatak4 {

    public static void main(String[] args) {

        // Zadatak 4: Kreiranje klase "Film"
        //Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
        // U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

        Film a = new Film();
        a.naslov = "The Lego";
        a.godinaIzdanja = 2014;
        a.reziser = "Christopher Miller";

        Film b = new Film();
        b.naslov = "Mud";
        b.godinaIzdanja = 2012;
        b.reziser = "Jeff Nichols";

        System.out.println("FIlm: " + a.naslov + " iz godine: " + a.godinaIzdanja + ", rezirao je: " + a.reziser);
        System.out.println("FIlm: " + b.naslov + " iz godine: " + b.godinaIzdanja + ", rezirao je: " + b.reziser);


    }
}
