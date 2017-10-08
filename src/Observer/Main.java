package Observer;


public class Main {

    public static void main(String[] args) {

        WeatherObservable weatherObservable = new WeatherObservable(null);
        UserObserver userObserver = new UserObserver();
        weatherObservable.addObserver(userObserver);
        weatherObservable.setWeather("Weather will be great.");

    }
}
