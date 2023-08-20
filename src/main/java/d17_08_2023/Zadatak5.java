package d17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unestite a: ");
        double a = s.nextDouble();

        System.out.print("Unesite b: ");
        double b = s.nextDouble();

        System.out.print("Unesite operator: ");
        String operator = s.next();

        Double result;

        if (operator.equals("+")) {
            result = a + b;
            System.out.println("Rezultat: " + result);
        } else if (operator.equals("-")) {
            result = a - b;
            System.out.println("Rezultat: " + result);
        } else if (operator.equals("*")) {
            result = a * b;
            System.out.println("Rezultat: " + result);
        } else if (operator.equals("/")) {
            result = a / b;
            System.out.println("Rezultat: " + result);
        }


          }
}
