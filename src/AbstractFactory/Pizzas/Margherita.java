package AbstractFactory.Pizzas;

public class Margherita extends Pizza {


    public Margherita(String dough, double size) {
        super();
        String[] temp = {"cheese", "tomato sauce"};
        this.topping =  temp;
    }
}


