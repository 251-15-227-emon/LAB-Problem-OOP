package LAB_04;

abstract class Payment {

    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

// Credit Card Payment Class
class CreditCardPayment extends Payment {

    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(double amount, String cardNumber, String cardHolderName) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment() {

        double charge = amount * 0.02; // 2% charge

        System.out.println("Credit Card Payment ");;
        System.out.println("Card Holder : " + cardHolderName);
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Amount      : " + amount);
        System.out.println("Charge      : " + charge);
        System.out.println("Total       : " + (amount + charge));
        System.out.println();
    }
}

// Mobile Payment Class
class MobilePayment extends Payment {

    private String mobileNumber;
    private String provider;

    public MobilePayment(double amount, String mobileNumber, String provider) {
        super(amount);
        this.mobileNumber = mobileNumber;
        this.provider = provider;
    }

    @Override
    public void processPayment() {

        double charge = amount * 0.01; // 1% charge

        System.out.println("Mobile Payment:");
        System.out.println("Provider     : " + provider);
        System.out.println("Mobile No.   : " + mobileNumber);
        System.out.println("Amount       : " + amount);
        System.out.println("Charge       : " + charge);
        System.out.println("Total        : " + (amount + charge));
    }
}

// Main Class
public class PaymentProblem {

    public static void main(String[] args) {

        Payment payment;

        payment = new CreditCardPayment(1000, "1234-5678-9012", "Emon");
        payment.processPayment();

        System.out.println("\n");

        payment = new MobilePayment(2000, "01712345678", "bKash");
        payment.processPayment();
        
        
    }

}
