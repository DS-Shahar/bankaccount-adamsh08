package adam;

public class BankAccount {

    private int balance;
    private int minbalance;
    private String owner;

    public BankAccount(int balance, int minbalance, String owner) {
        this.balance = balance;
        this.minbalance = minbalance;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public int getMinbalance() {
        return minbalance;
    }

    public void setBalance(int balance) {
        if (balance > this.minbalance) {
            this.balance = balance;
        }
    }

    public boolean withdraw(int amount) {
        if (balance - amount < minbalance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean transfer(BankAccount toAccount, int amount) {
        if (withdraw(amount)) {
            toAccount.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

    
    public String toString() {
        return "Balance of " + owner + ": " + balance;
    }
}
