package AbstractFactory.Pizzas;

public class Hawaiian extends Pizza {


    public Hawaiian(String dough, double size) {
        super();
        String[] temp = {"cheese", "pineapple"};
        this.topping =  temp;
    }
}


