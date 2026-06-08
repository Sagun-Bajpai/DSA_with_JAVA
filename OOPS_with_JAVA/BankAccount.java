package OOPS_with_JAVA;

public class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("deposit amount: " + amount);
        }

    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("withdraw amount : " + amount);
        } else {
            System.out.println("Insufficient Amount or Invalid Amount");
        }
    }

    public void display() {
        System.out.println("AccountHolder name: " + accountHolder);
        System.out.println("current amount is: " + this.balance);
        System.out.println("_________________");
    }

    public static void main(String[] args) {
        BankAccount A1 = new BankAccount("sagun", 3000);
        A1.display();
        A1.deposit(2000);
        A1.display();

        A1.withdraw(1000);
        A1.display();

        A1.deposit(500);
        A1.display();

        A1.withdraw(5000);
        A1.display();

    }

}
