import java.util.Scanner;

public class Main {

    private static BankAccount account = null;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        boolean running = true;

        // Welcome message
        System.out.println("   Welcome to Simple Banking");

        // Main menu loop - keeps running until user chooses to exit
        while (running) {
            displayMenu();
            choice = readIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    displayAccountDetails();
                    break;
                case 6:
                    System.out.println("Thank you for using Simple Banking. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.\n");
            }
        }

        scanner.close();
    }

    /**
     * Displays the main menu options.
     */
    private static void displayMenu() {
        System.out.println("-------- Main Menu --------");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Display Account Details");
        System.out.println("6. Exit");
        System.out.println("---------------------------");
    }

    /**
     * Creates a new bank account if one does not already exist.
     */
    private static void createAccount() {
        if (account != null) {
            System.out.println("An account already exists. Only one account is supported.\n");
            return;
        }

        System.out.println("\n--- Create New Account ---");

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine().trim();

        // Validate that account number is not empty
        if (accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be empty.\n");
            return;
        }

        System.out.print("Enter Account Holder Name: ");
        String holderName = scanner.nextLine().trim();

        // Validate that holder name is not empty
        if (holderName.isEmpty()) {
            System.out.println("Error: Account holder name cannot be empty.\n");
            return;
        }

        double initialBalance = readDoubleInput("Enter Initial Balance: ");

        // Validate that initial balance is not negative
        if (initialBalance < 0) {
            System.out.println("Error: Initial balance cannot be negative.\n");
            return;
        }

        // Create the BankAccount object using the constructor
        account = new BankAccount(accountNumber, holderName, initialBalance);
        System.out.println("Account created successfully!\n");
    }

    /**
     * Deposits money into the existing account.
     */
    private static void depositMoney() {
        if (!isAccountCreated()) {
            return;
        }

        System.out.println("\n--- Deposit Money ---");
        double amount = readDoubleInput("Enter amount to deposit: ");
        account.deposit(amount);
        System.out.println();
    }

    /**
     * Withdraws money from the existing account.
     */
    private static void withdrawMoney() {
        if (!isAccountCreated()) {
            return;
        }

        System.out.println("\n--- Withdraw Money ---");
        double amount = readDoubleInput("Enter amount to withdraw: ");
        account.withdraw(amount);
        System.out.println();
    }

    private static void checkBalance() {
        if (!isAccountCreated()) {
            return;
        }

        System.out.println("\n--- Check Balance ---");
        account.checkBalance();
        System.out.println();
    }

    private static void displayAccountDetails() {
        if (!isAccountCreated()) {
            return;
        }

        account.displayAccountDetails();
    }

    private static boolean isAccountCreated() {
        if (account == null) {
            System.out.println("No account found. Please create an account first (Option 1).\n");
            return false;
        }
        return true;
    }

    private static int readIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine(); // consume the leftover newline
                return value;
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }

    private static double readDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine(); // consume the leftover newline
                return value;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}
