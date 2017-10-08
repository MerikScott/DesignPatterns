package AbstractFactory.Factories;

import AbstractFactory.Pizzas.Hawaiian;
import AbstractFactory.Pizzas.Pizza;

public class HawaiianPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizza(String dough, double size) {
        Pizza hawaiianPizza = new Hawaiian(dough, size);
        return hawaiianPizza;
    }
}

