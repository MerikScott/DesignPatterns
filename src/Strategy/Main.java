package Strategy;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Item item = new Item();
        item.setId("Misiek");
        item.setPrice(25);
        shop.addItem(item);

        item.setId("Pimpek");
        item.setPrice(30);
        shop.addItem(item);

        item.setId("Sos czosnkowy");
        item.setPrice(40);
        shop.addItem(item);



        shop.pay(new PayPalStrategy("myemail@example.com", "pssswd"));

        shop.pay(new CreditCardStrategy("Janina Novakp", "1234567890123456", "786"));

    }
}
