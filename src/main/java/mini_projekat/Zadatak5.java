package mini_projekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        5.	**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//        Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//        Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//                Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//                Glavni program:
//        - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//                - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
// Primer izvršenja 1:
// Unesite dužinu passworda: 10
// Da li želite da sadrži specijalan karakter: true
// Generisan password: eD9Kx0e@
//
// Primer izvršenja 2:
// Unesite dužinu passworda: 10
// Da li želite da sadrži specijalan karakter: false
// Generisan password: eCxdwEeFEx


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite dužinu passworda: ");
        int n = s.nextInt();

        System.out.print("Da li želite da sadrži specijalan karakter: ");
        boolean spec = s.nextBoolean();

        String karakter = "";

        for (int i = 0; i < n-1; i++) {
            karakter = karakter + randomKaraktrer();
        }

        if(spec){
            karakter = karakter + randomSpecijalniKarakter();
        }else karakter = karakter + randomKaraktrer();

        System.out.println("Generisan password: " + karakter);

    }

    public static String randomKaraktrer() {

        ArrayList<String> niz = new ArrayList<>();

        niz.add("A");
        niz.add("a");
        niz.add("B");
        niz.add("b");
        niz.add("C");
        niz.add("c");
        niz.add("D");
        niz.add("d");
        niz.add("E");
        niz.add("e");
        niz.add("F");
        niz.add("f");
        niz.add("G");
        niz.add("g");
        niz.add("H");
        niz.add("h");
        niz.add("I");
        niz.add("i");
        niz.add("J");
        niz.add("j");
        niz.add("K");
        niz.add("k");
        niz.add("L");
        niz.add("l");
        niz.add("M");
        niz.add("m");
        niz.add("N");
        niz.add("n");
        niz.add("O");
        niz.add("o");
        niz.add("P");
        niz.add("p");
        niz.add("Q");
        niz.add("q");
        niz.add("R");
        niz.add("r");
        niz.add("S");
        niz.add("s");
        niz.add("T");
        niz.add("t");
        niz.add("U");
        niz.add("u");
        niz.add("V");
        niz.add("v");
        niz.add("W");
        niz.add("w");
        niz.add("X");
        niz.add("x");
        niz.add("Y");
        niz.add("y");
        niz.add("Z");
        niz.add("z");
        niz.add("1");
        niz.add("2");
        niz.add("3");
        niz.add("4");
        niz.add("5");
        niz.add("6");
        niz.add("7");
        niz.add("8");
        niz.add("9");
        niz.add("0");

        Random random = new Random();

        int index = random.nextInt(niz.size());
        return niz.get(index);
    }

    public static String randomSpecijalniKarakter (){

        ArrayList<String> spec = new ArrayList<>();
        spec.add("@");
        spec.add("#");
        spec.add("&");
        spec.add("*");
        spec.add("!");

        Random random = new Random();

        int index = random.nextInt(spec.size());
        return spec.get(index);
    }
}
