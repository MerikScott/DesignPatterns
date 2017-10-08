package Observer;

import java.util.Observable;
import java.util.Observer;

public class UserObserver implements Observer {
    WeatherObservable weatherObservable = new WeatherObservable();



    @Override
    public void update(Observable weather, Object arg) {
        //weather = (weatherObservable) arg;
        System.out.println("Weather update: " + weatherObservable.getWeather());
    }


}
