void main() {
    System.out.println("Welcome to Swiss Bank Account");
    Account rajendra = new Account("543122985578", "Rajendra", 20000);
    double balance = rajendra.getBalance();
    System.out.println(balance);
}