package AbstractFactory;

import AbstractFactory.*;
import AbstractFactory.Factories.HawaiianPizzaFactory;
import AbstractFactory.Factories.MargheritaPizzaFactory;
import AbstractFactory.Factories.PepperoniPizzaFactory;
import AbstractFactory.Pizzas.Pizza;

public class Main {

    public static void main(String[] args) {
        String dough = "thin";
        double size = 40.0;
        System.out.println("Hello Pizza Factory!");
        Pizza margherita;
        Pizza pepperoni;
        Pizza hawaiian;


        PizzaCreator pizzaCreator = new PizzaCreator();
        margherita = pizzaCreator.getPizza(new MargheritaPizzaFactory(), dough, size);
        pepperoni = pizzaCreator.getPizza(new PepperoniPizzaFactory(), dough, size);
        hawaiian = pizzaCreator.getPizza(new HawaiianPizzaFactory(), dough, size);

        System.out.println("My margherita" + margherita.toString());
        System.out.println("Time for pepperoni" + pepperoni.toString());
        System.out.println("Here goes hawaiian" + hawaiian.toString());




    }
}
