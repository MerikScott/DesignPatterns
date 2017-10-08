package Factory;

public class SmallCar extends Car {

    public SmallCar(CarType model) {
        super(model);
        construct();
    }
}
