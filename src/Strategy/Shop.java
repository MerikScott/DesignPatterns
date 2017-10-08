package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Item> shop = new ArrayList<>();

    public boolean addItem(Item item) {
        shop.add(item);
        return true;
    }

    public boolean removeItem(Item item) {
        for (Item itemInShop : shop) {
            if (item.getId() == itemInShop.getId()) {
                shop.remove(itemInShop);
                return true;
            }
        }
        return false;
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : shop) {
            sum = sum + item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategyInterface paymentMethod) {
        System.out.println("Paid");
    }


}
