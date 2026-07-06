package DAY_15;

// code for check insufficient fund exception
class insufficientFund extends Exception {

    insufficientFund(String message) {
        super(message);
    }

}

class BankAccount {
    double balance;

    // BankAccount(double balance) {
    // this.balance = balance;
    // }

    public void withdraw(double amount) throws insufficientFund {
        if (amount > balance) {
            throw new insufficientFund("Insufficient funds in the account");
        }
        // balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

public class InsufficientFunds {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.balance = 1000;

        try {
            account.withdraw(1500);
        } catch (insufficientFund e) {
            System.out.println(e.getMessage());
        }
    }
}