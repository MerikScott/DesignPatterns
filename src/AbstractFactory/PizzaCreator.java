package AbstractFactory;

import AbstractFactory.Factories.AbstractPizzaFactory;
import AbstractFactory.Pizzas.Pizza;

public class PizzaCreator {

    public static Pizza getPizza(AbstractPizzaFactory factory, String dough, double size) {
        return factory.createPizza(dough, size);
    }

}
