package com.javarush.module2.lesson1;

public class Example2 {
    public static void main(String[] args) {
        Client client = new Client("Name", 0, 1000);
        client.getName();
    }
}

//OOP ( state(fields), behavior(methods))
// Data structure vs Object
class Client {
    private String name;
    private int badHistory;
    private long balance;

    public Client(String name, int badHistory, long balance) {
        this.name = name;
        this.badHistory = badHistory;
        this.balance = balance;
    }

    public void updateBalance(long balanceDelta) {
        if (this.balance - balanceDelta < 0 && badHistory > 0) {
           throw new LoanException();
        }
        this.balance += balanceDelta;
    }

     String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


}
