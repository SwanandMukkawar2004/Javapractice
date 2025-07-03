package javaonlypractice;

public class java10 {
    private int balance;

    public java10() {
        balance = 0;
    }
    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }
    public int getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        java10 account = new java10();
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(400);
        System.out.println("Balance: " + account.getBalance());
    }
}
