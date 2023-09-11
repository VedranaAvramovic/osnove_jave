package d8_9_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        FacebookPost jedan = new FacebookPost();
        jedan.korisnik = "Vedrana Avramovic";
        jedan.profil = "Vedrana Avramovic";
        jedan.text = "IT bootcamp.";

        FacebookPost dva = new FacebookPost();
        dva.korisnik = "Vedrana Avramovic";
        dva.profil = "Vedrana Avramovic";
        dva.text = "Dobar dan.";

        jedan.lajkovi();
        jedan.lajkovi();
        jedan.share();
        jedan.dislike();
        jedan.share();

        jedan.print();

        dva.lajkovi();
        dva.lajkovi();
        dva.share();
        dva.dislike();

        dva.print();
    }
}
