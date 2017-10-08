package AbstractFactory.Factories;

import AbstractFactory.Pizzas.Pepperoni;
import AbstractFactory.Pizzas.Pizza;

public class PepperoniPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza(String dough, double size) {
        Pizza pepperoniPizza = new Pepperoni(dough, size);
        return pepperoniPizza;
    }
}

