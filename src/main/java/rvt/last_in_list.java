package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class last_in_list {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        
    ArrayList<String> userList = new ArrayList<>();

    System.out.println("Enter values (enter an empty line to quit):");

    while (true) {
           
            String input = scanner.nextLine();

          
            if (input.isEmpty()) { 
                break; 
            }

      
            userList.add(input);
        }

       
        int count = userList.size(); 

        System.out.println("In total: " + count);
        
        scanner.close(); 

        if (!userList.isEmpty()) {
            
            int lastIndex = userList.size() - 1;
            
            System.out.println("The last item was: " + userList.get(lastIndex));
        } else {
            System.out.println("No items were entered.");
        }
}
}