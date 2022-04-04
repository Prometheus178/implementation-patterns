package crearter.model;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
