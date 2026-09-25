class InsufficientBalanceException extends Exception {

    // Constructor
    InsufficientBalanceException(String message) {
        super(message);
    }
}


public class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Withdraw method
    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance for withdrawal."
            );
        }

        balance -= amount;

        System.out.println(
            "Withdrawal successful. New balance: " + balance
        );
    }

    // Display balance
    void displayBalance() {
        System.out.println("Final balance: " + balance);
    }


    // Main method
    public static void main(String[] args) {

        BankAccount account =
            new BankAccount("123456", "John Doe", 1000.0);

        try {

            account.withdraw(1200.0);

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());
        }

        account.displayBalance();
    }
} 