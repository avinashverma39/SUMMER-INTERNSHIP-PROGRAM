
public class BankAccount {

    // Private fields - only this class can access them directly (encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

   
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }

    // Getter methods - allow other classes to read account information safely

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

 
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than zero.");
            return false;
        }
        accountBalance += amount;
        System.out.println("Successfully deposited $" + amount);
        return true;
    }

 
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
            return false;
        }
        if (amount > accountBalance) {
            System.out.println("Error: Insufficient balance. Current balance: $" + accountBalance);
            return false;
        }
        accountBalance -= amount;
        System.out.println("Successfully withdrew $" + amount);
        return true;
    }

    /**
     * Displays the current account balance.
     */
    public void checkBalance() {
        System.out.println("Current Balance: $" + accountBalance);
    }

    /**
     * Displays all account details in a formatted way.
     */
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : $" + accountBalance);
        System.out.println("-----------------------\n");
    }
}
