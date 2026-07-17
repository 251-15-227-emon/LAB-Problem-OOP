package Lab_03;

interface Transaction{

void deposit(double amount);
void withdraw (double amount );

}


abstract class Account {

double balance;

Account (double balance){

this.balance=balance;

}
abstract void yearly ();
abstract void loan ();
}
class Savings extends Account implements Transaction {

    public Savings(double balance) {
        super(balance);
    }

    @Override
    public void yearly() {
        double charge = balance * 0.05;
        System.out.println("Saving Yearly Charge = " + charge);
    }

    @Override
    public void loan() {
        double loan = balance * 0.50;
        System.out.println("Saving Loan Amount = " + loan);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful.");
        System.out.println("Current Balance = " + balance);
    }

    @Override
    public void withdraw(double amount) {

        double minimumBalance = balance * 0.02;

        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdraw Successful.");
            System.out.println("Current Balance = " + balance);
        } else {
            System.out.println("Withdrawal Failed! Minimum 2% balance must remain.");
        }
    }
}

//==================== Current Account ====================

class Current extends Account implements Transaction {

    public Current(double balance) {
        super(balance);
    }

    @Override
    public void yearly() {
        double charge = balance * 0.10;
        System.out.println("Current Yearly Charge = " + charge);
    }

    @Override
    public void loan() {
        double loan = balance * 0.70;
        System.out.println("Current Loan Amount = " + loan);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful.");
        System.out.println("Current Balance = " + balance);
    }

    @Override
    public void withdraw(double amount) {

        double minimumBalance = balance * 0.05;

        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdraw Successful.");
            System.out.println("Current Balance = " + balance);
        } else {
            System.out.println("Withdrawal Failed! Minimum 5% balance must remain.");
        }
    }
}

//==================== Main Class ====================

public class Bank {

    public static void main(String[] args) {

        // Polymorphism
        Account account;

        System.out.println("========== Saving Account ==========");

        account = new Savings(10000);

        Savings s = (Savings) account;

        s.deposit(5000);
        s.withdraw(4000);
        s.yearly();
        s.loan();

        System.out.println();

        System.out.println("========== Current Account ==========");

        account = new Current(20000);

        Current c = (Current) account;

        c.deposit(3000);
        c.withdraw(5000);
        c.yearly();
        c.loan();
    }
}

