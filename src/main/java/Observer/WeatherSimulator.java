package Observer;

public class WeatherSimulator {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        DisplayObserver observer1 = new DisplayObserver("Observer 1");
        DisplayObserver observer2 = new DisplayObserver("Observer 2");
        DisplayObserver observer3 = new DisplayObserver("Observer 3");

        weatherStation.registerObserver(observer1);
        weatherStation.registerObserver(observer2);
        weatherStation.registerObserver(observer3);

        Thread weatherThread = new Thread(weatherStation);
        weatherThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        weatherStation.removeObserver(observer2);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the weather station thread (optional, as it's an eternal loop)
        // weatherThread.interrupt();
    }
}
