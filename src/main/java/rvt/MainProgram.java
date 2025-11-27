package rvt;


public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);
    }
}

class PaymentCard {
    
    private double balance;

    public PaymentCard(double openingBalance) {
        
    }

    public String toString() {
       return "The card has balance of " + this.balance + "eur.";
    }

public void eatAffordably() {
    if(this.balance >= 2.60){

        balance = balance - 2.60;
    }
    else{
        
    }    
}

public void eatHeartily() {
    if(this.balance >= 2.60){

        balance = balance - 2.60;
    }
    else{        
    }
}

public void addMoney(double ammount){
 
}



}