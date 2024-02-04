package Observer;

interface WeatherSubject {
    void registerObserver (WeatherObserver observer);
    void removeObserver8 (WeatherObserver observer);
    void notifyObservers();
}
