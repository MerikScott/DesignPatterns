package Dekorator;

public class Tea implements Drinkable {

    @Override
    public String getDescription() {
        return "Herbata czarna";
    }

    @Override
    public double calculateCosts() {
        return 3.2;
    }
}
