package d21_08_2023;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        int like = 0, smile = 0, heart = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Reaguj: ");
            String reakcija = s.next();

            if (reakcija.equals("like"))
                like = like + 1;
            else if (reakcija.equals("smile"))
                smile = smile + 1;
            else if (reakcija.equals("heart"))
                heart = heart + 1;
        }

        System.out.println("Reaguj: likeSummary: like " + like + " smile " + smile + " heart " + heart);
    }

}
