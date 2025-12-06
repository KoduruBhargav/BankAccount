public class Account {
    // fields
    private String accountNo;
    private String name;
    private double balance;
    public Account(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
