package d25_08_2023;

public class Zadatak3 {

//    3.Zadatak
//    Napisati metodu koja stampa podatke o korisniku u formatu:
//    JMBG: [jmbg]
//    Ime: [ime]
//    Prezime: [prezime]
//    God. rodjenja: [god]
//    Aktivan: [true/false]
//    Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

    public static void main(String[] args) {

        licniPodaci("2525525362","Janko","Jankovic", 1999,true);
    }
    public static void licniPodaci (String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }

}
