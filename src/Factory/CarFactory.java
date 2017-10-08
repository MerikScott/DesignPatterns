package Factory;

public class CarFactory {

    public static Car buildCar(CarType model) {
        switch(model) {
            case LUXURY: {
                Car luxuryCar = new LuxuryCar(model);
                return luxuryCar;
            }
            case SEDAN: {
                Car sedanCar = new SedanCar(model);
                return sedanCar;
            }

            case SMALL: {
                Car smallCar = new SmallCar(model);
                return smallCar;
            }

            default: {
                System.out.println("Model mismatch error");
                return null;
            }
        }
    }
}
