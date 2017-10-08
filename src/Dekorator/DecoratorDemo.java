package Dekorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Drinkable espresso = new Espresso();
        Drinkable drink = new Cream(new Chockolate(new Espresso()));
        System.out.println(drink.getDescription());
        System.out.println(drink.calculateCosts());
        System.out.println(" - - - - - - - ");

        Drinkable tea = new Tea();
        Drinkable teaDrink = new Cream(new Tea());
        System.out.println(teaDrink.getDescription());
        System.out.println(teaDrink.calculateCosts());
    }
}
