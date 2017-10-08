package AbstractFactory.Pizzas;

import java.util.Arrays;

public abstract class Pizza {
    protected String[] topping;
    private String dough;
    private double size;

    public Pizza(String dough, double size) {
        this.dough = dough;
        this.size = size;
    }

    public Pizza() {

    }

    public  String[] getToppings() {
        return topping;
    }

    public  String getDough() {
        return dough;
    }

    public  double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping=" + Arrays.toString(topping) +
                ", dough='" + dough + '\'' +
                ", size=" + size +
                '}';
    }
}
