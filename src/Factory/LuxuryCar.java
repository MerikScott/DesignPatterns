package Factory;

public class LuxuryCar extends Car {

    public LuxuryCar(CarType model) {
        super(model);
        construct();
    }
}
