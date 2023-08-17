package p17_08_2023;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj telefona");
        String broj = s.next();

        if (!broj.contains ("+381" )); {
            System.out.println("Broj telefona nije validan.");}

         if (broj.contains ("/")); {
                System.out.println("Broj telefona nije validan.");
        }
    }
}
