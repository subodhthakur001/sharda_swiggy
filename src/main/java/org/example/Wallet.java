package org.example;

public class Wallet {
     String orderId;
     String userName;
     int balance;

    public Wallet(String orderId, String userName, int balance) {
        this.orderId = orderId;
        this.userName = userName;
        this.balance = balance;
    }
    public boolean checkbalance(int totalbill, int balance){
        if(totalbill > balance){
            return false;
        }
        return true;
    }
}
