public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println("Withdrawal: " + amount);
            balance -= amount;
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Not enough money for withdraw");
        }
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Deposit: " + amount);
            balance += amount;
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("You didn't have money to deposit.");
        }
    }
}