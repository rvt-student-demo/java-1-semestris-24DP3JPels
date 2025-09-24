package rvt;

import java.util.Scanner;

public class seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much day caculate, yu decide?");
        int cilveks = scanner.nextInt();

        int cilvece = cilveks * 24 * 60 * 60;

        System.out.println("Tavas dienas, Sekundes: " + cilvece);
    }
}

