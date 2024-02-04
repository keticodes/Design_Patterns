package Observer;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

// Concrete subject class
class WeatherStation implements Runnable {
    private List<WeatherObserver> observers = new ArrayList<>();
    private int temperature;
    private int minTemperature = -10;
    private int maxTemperature = 40;

    public WeatherStation() {
        this.temperature = generateRandomTemperature();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(generateRandomTimeInterval());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Simulate temperature change
            int temperatureChange = new Random().nextBoolean() ? 1 : -1;
            temperature += temperatureChange;

            // Ensure temperature is within bounds
            temperature = Math.max(minTemperature, Math.min(maxTemperature, temperature));

            // Notify observers
            notifyObservers();
        }
    }


    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (WeatherObserver observer : observers) {

            observer.update(temperature);
        }
    }

    private int generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(maxTemperature - minTemperature + 1) + minTemperature;
    }

    private int generateRandomTimeInterval() {
        Random random = new Random();
        return random.nextInt(5000) + 1000; // between 1 and 5 seconds
    }
}

