package d15_08_2023;

public class Zadatak5 {

    public static void main(String[] args) {

//Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//Primer izvrsenja programa:
//a: 10
//Povrsina je 43.25
//Obim je 30


        double korenBroja3 = 1.73;
        int a = 10;
        double površinaTrougla = (a * a * korenBroja3)/4;
        double obimTrougla = a * 3;

        System.out.println("a: " + a);
        System.out.println("Površina je " + površinaTrougla );
        System.out.println("Obim je " + obimTrougla);


    }
}
