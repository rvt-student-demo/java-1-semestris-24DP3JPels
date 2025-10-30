package rvt;

import java.util.Scanner;
// Dalot ar ((int) ar (int)) rezultats vienmer ir int
public class average {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        // lai raditu precizaku dalijumu neizmanto(int) bet gan (double)!!!!\\
        System.out.println("Ievadi pirmo sakitli: ");
        int pirmais = scannner.nextInt();

        System.out.println("Ievadi ceturto sakitli: ");
        int otrais = scannner.nextInt();

        System.out.println("Ievadi trešo sakitli: ");
        int tresais = scannner.nextInt();

        int kopums = pirmais + otrais + tresais;

        double beigas = kopums/3.0;

        System.out.println("CIPARU VIDEJA SUMMA : " + beigas);
    }
    
}
// ALT + SHIFT + F = izlidzina visu tava vieta