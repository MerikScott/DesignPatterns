package AbstractFactory.Pizzas;

public class Pepperoni extends Pizza {


    public Pepperoni(String dough, double size) {
        super();
        String[] temp = {"cheese", "tomato sauce", "pepperoni", "olives"};
        this.topping =  temp;
    }
}


