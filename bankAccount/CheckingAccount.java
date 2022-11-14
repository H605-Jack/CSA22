package bankAccount;

/**
 * CheckingAccount
 */
public class CheckingAccount {
    private String accountHolder;
    private double balance;

    public CheckingAccount() {
        this.balance = 0.0;
        this.accountHolder = "unknown";
    }

    public CheckingAccount(double balance, String holder) {
        this.balance = balance;
        this.accountHolder = holder;
    }

    public double deposit(double amount) {
        this.balance = amount + this.balance;
        return this.balance;
    }

    public double deposit(double amount, String accountHolderName) {
        this.balance = amount + this.balance;
        this.accountHolder = accountHolderName;
        return this.balance;
    }

    public double withdrawal() {
        return this.balance;
    }
}