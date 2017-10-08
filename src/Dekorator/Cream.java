package Dekorator;

public class Cream extends DrinkIngredient {

    public Cream(Drinkable drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", bita śmietana.";
    }

    @Override
    public double calculateCosts() {
        return drink.calculateCosts() + 2.3;
    }
}
