package strategy.model;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
