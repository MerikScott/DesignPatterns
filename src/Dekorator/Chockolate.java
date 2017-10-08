package Dekorator;

public class Chockolate extends DrinkIngredient {

    public Chockolate(Drinkable drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", czekolada";
    }

    @Override
    public double calculateCosts() {
        return drink.calculateCosts() + 1.5;
    }
}
