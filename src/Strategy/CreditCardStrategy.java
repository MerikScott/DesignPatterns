package Strategy;

public class CreditCardStrategy implements PaymentStrategyInterface {
    private String name;
    private String cardNumber;
    private String cvv;

    public CreditCardStrategy(String name, String cardNumber, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pay with " + this.getClass().getName());
        System.out.println("Amount to pay: " + amount);
    }
}
