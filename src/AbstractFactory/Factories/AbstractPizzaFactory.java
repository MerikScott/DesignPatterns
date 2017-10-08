package AbstractFactory.Factories;

import AbstractFactory.Pizzas.Pizza;

public abstract class AbstractPizzaFactory {


    public abstract Pizza createPizza(String dough, double size);
}
