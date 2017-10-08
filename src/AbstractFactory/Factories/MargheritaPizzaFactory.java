package AbstractFactory.Factories;

import AbstractFactory.Pizzas.Margherita;
import AbstractFactory.Pizzas.Pizza;

public class MargheritaPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza(String dough, double size) {
        Pizza margheritaPizza = new Margherita(dough, size);
        return margheritaPizza;
    }
}

