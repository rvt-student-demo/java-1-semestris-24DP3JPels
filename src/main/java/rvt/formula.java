package rvt;

import java.util.Scanner;

public class formula {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo ciparu : ");
        int pirmais = scanner.nextInt();
        System.out.println("Ievadi otru sakitli : ");
        int otrais = scanner.nextInt();

        int rezultats = pirmais + otrais;
        System.out.println("Kopejais rezultats : " + rezultats);
    }
    
}
