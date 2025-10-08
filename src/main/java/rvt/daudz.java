package rvt;
import java.util.Scanner;
public class daudz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int kopa = 0;
        int apli = 0;

        while(true) {
            System.out.println("Give me number, plez : ");
            int skaitlis = scanner.nextInt();

            if (skaitlis == 0) {
                break;
            }
            kopa += skaitlis;
            apli += 1;
        }
        System.out.println("Sum: " + kopa);
        System.out.println("Num of Numbers :" + apli);
    }
    
} 
