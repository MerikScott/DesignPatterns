package Factory;

public class SedanCar extends Car {

    public SedanCar(CarType model) {
        super(model);
        construct();
    }
}
