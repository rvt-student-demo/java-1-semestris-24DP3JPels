package rvt;

import java.util.Scanner;

  public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
      
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        
        this.count = this.count + 1;
        this.sum = this.sum + number;
    }

    public int getCount() {
        
        return this.count;
    }

    public int sum() {
        
        return this.sum;
    }

    public double average() {
        
        if (this.count == 0) {
            return 0.0;
        }

       
        return (double) this.sum / this.count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Ievadi Ciparus: :");

        // Lai beigtu visu ievadi -1!!!!!!!!!!
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            
            allNumbers.addNumber(number);

            
            if (number % 2 == 0) {
                
                evenNumbers.addNumber(number);
            } else {
            
                oddNumbers.addNumber(number);
            }
        }

        
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());

        scanner.close();
    
}
  }
   