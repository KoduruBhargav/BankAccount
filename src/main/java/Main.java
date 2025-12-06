void main() {
    System.out.println("Welcome to Swisster Bank Account");
    System.out.println("================================");

    // Create account
    Account rajendra = new Account("543122985578", "Rajendra", 20000);

    // Check balance
    System.out.println("\nCurrent Balance: " + rajendra.getBalance());

    // Deposit money
    rajendra.deposit(500);
    System.out.println("After Deposit: " + rajendra.getBalance());

    // Withdraw money
    rajendra.withDraw(1000);
    System.out.println("After Withdraw: " + rajendra.getBalance());
}