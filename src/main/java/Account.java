public class Account {
    // Fields
    private String accountNo;
    private String name;
    private double balance;

    // Constructor
    public Account(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        System.out.printf("Account No: %s%nName: %s%nBalance: %.2f%n", this.accountNo, this.name, this.balance);
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    // Withdraw
    public void withDraw(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a positive amount");
            return;
        }
        if (amount > balance) {
            System.out.println("Please enter available amount");
            return;
        }
        balance -= amount;
    }
}