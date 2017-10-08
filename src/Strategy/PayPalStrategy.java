package Strategy;

public class PayPalStrategy implements PaymentStrategyInterface {
    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Pay with " + this.getClass().getName());
        System.out.println("Amount to pay: " + amount);
    }
}
