package rvt;
import java.util.Scanner;

public class ieavaditaiscip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Ievadi skaitli : ");

            if(scanner.nextInt() == 5){
                System.out.println("Cikls beidzies jo ievadiji 5!");
                break;
            }
        }
    }
}
