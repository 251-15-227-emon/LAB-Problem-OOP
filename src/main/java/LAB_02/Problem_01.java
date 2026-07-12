package LAB_02;

class Account {

    String accountNumber;
    String holderName;

    Account(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
    }
}

class Deposit {

    void deposit(double amount) {
        System.out.println("Deposit Amount: " + amount);
    }

    void deposit(double amount, String note) {
        System.out.println("Deposit Amount: " + amount);
        System.out.println("Note: " + note);
    }

    void deposit(double amount, String note, String date) {
        System.out.println("Deposit Amount: " + amount);
        System.out.println("Note: " + note);
        System.out.println("Date: " + date);
    }
}

public class Problem_01 {

    public static void main(String[] args) {

        SavingsAccount emma = new SavingsAccount("SA1001", "Emma");

        emma.displayAccountInfo();

        System.out.println("\nDeposit 1:");
        Deposit d = new Deposit();

        d.deposit(50000);

        System.out.println("\nDeposit 2:");

        d.deposit(25000, "Performance Bonus");

        System.out.println("\nDeposit 3:");

        d.deposit(1300,
                "Birthday gift from Aunt Lucy",
                "23-06-2026");
    }

}
