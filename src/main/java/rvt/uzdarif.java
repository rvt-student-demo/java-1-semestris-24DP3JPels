package rvt;

import java.util.Scanner;

public class uzdarif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();

        if (b > 0) {
            System.out.println("sakitlis ir pozitivs");
        }

        else {
            System.out.println("skaitlis ir negativs");
        }
    }
}
