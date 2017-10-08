package Observer;

import java.util.Observable;

public class WeatherObservable extends Observable {
     static String weather;

    public WeatherObservable(String weather) {
        this.weather = weather;
    }

    public WeatherObservable() {
    }

    public  String getWeather() {
        return weather;
    }


    public void setWeather(String weather) {
        this.weather = weather;
        super.setChanged();
        super.notifyObservers();

    }
}
