package rvt;
import java.util.Scanner;
public class sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kopa = 0;
        int start = 0;
        int end = 0;
        int i = 0;

        System.out.println("Ievadi skaitli : ");
        start = scanner.nextInt();
        System.out.println("Ievadi skaitli : ");
        end = scanner.nextInt();

    for (i = start; i <= end ; i++) {

        kopa += i;
}
    
    System.out.println("---------------");
    System.out.println("Tev sanaca : "+ kopa);    
    }
}

