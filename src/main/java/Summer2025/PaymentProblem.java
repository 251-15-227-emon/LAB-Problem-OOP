package Summer2025;

abstract class Payment {

    double amount;

    Payment(double amount) {

        this.amount = amount;

    }

    abstract void processPayment();

}

class CreditCardPayment extends Payment {

    String cardNumber, cardHolder;

    CreditCardPayment(double amount, String cardNumber, String cardHolder) {

        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment() {

        System.out.println("Card Number :" + cardNumber);
        System.out.println("Card Holder Name :" + cardHolder);
        System.out.println("Payment Amount : " + amount);

    }
}

class MobilePayment extends Payment {

    String MobileNumber, Provider;

    MobilePayment(double amount, String MobileNumber, String Provider) {

        super(amount);
        this.MobileNumber = MobileNumber;
        this.Provider = Provider;
    }

    @Override
    public void processPayment() {

        System.out.println("Mobile Number :" + MobileNumber);
        System.out.println("Provider :" + Provider);
        System.out.println("Payment Amount : " + amount);

    }
}

public class PaymentProblem {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(5000, "01247146711", "Emon Sarkar");
        p1.processPayment();
        System.out.println();

        Payment p2 = new MobilePayment(4000, "0187257522", "Alim Uddin");
        p2.processPayment();

    }

}
