package p21_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        String levaStrana = "";
        String desnaStrana = "";

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                desnaStrana = desnaStrana + i;
            } else {
                levaStrana = i + levaStrana;
            }
        }

        System.out.println("String je " + levaStrana + "..." + desnaStrana );

        }
}
