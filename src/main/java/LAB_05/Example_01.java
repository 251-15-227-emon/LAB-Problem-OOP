package LAB_05;

abstract class Payment {

    double amount;

    Payment(double amount) {

        this.amount = amount;
    }

    public abstract void processPayment();

}

class CreditCardPayment extends Payment {

    String cardHolderName;
    String cardNumber;

    CreditCardPayment(double amount, String cardHolderName, String cardNumber) {

        super(amount);
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;

    }

    @Override
    public void processPayment() {

        double fee = amount * 0.02;
        double totalAmount = amount + fee;

        System.out.println("========= Payment Details =======");
        
        System.out.println("Card Holder Name :"+cardHolderName);
        System.out.println("CardNumber :"+cardNumber);

        System.out.println("Amount : " + amount);
        System.out.println("Fee: " + fee);
        System.out.println("Total Amount : " + totalAmount);

    }

}

public class Example_01 {

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(10000, "Emon Sarkar", "01010102933");
        p1.processPayment();
    }

}
