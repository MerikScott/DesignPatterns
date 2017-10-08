package Dekorator;

public class Espresso implements Drinkable {
    @Override
    public String getDescription() {
        return "Kawa Ekspresso";
    }

    @Override
    public double calculateCosts() {
        return 5.2;
    }
}
