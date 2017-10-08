package Factory;

public abstract class Car {
    CarType carType;


    public Car(CarType model) {
        this.carType = model;
    }

    protected void construct() {
        System.out.println("Building a car: " + carType.name());
    }
}
