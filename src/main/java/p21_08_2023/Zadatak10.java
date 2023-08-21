package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unestite password: ");
        String password = s.next();

        String skriveni = "";

        for (int i = 0; i < password.length(); i++) {
            skriveni = skriveni + "*";
        }

        System.out.println("Skriveni password: " + skriveni);
    }
}
