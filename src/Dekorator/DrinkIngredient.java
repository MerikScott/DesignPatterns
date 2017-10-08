package Dekorator;

public abstract class DrinkIngredient implements Drinkable {
    protected Drinkable drink;

    public DrinkIngredient(Drinkable drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }

    @Override
    public double calculateCosts() {
        return drink.calculateCosts();
    }
}
