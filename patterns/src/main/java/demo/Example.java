package demo;

import demo.observer.WeatherData;
import demo.observer.WeatherDataCenter;
import demo.observer.WeatherDataReceiver;

public class Example {
    public static void main(String[] args) {
//        // factory
//        TransportFactory transportFactory = new TransportFactory();
//        Transport wagon = transportFactory.getTransport(TransportType.WAGON);
//        Transport ship = transportFactory.getTransport(TransportType.SHIP);
//        List<Transport> transports = new ArrayList<>();
//        transports.add(wagon);
//        transports.add(ship);
//
//        for (Transport transport : transports) {
//            transport.deliver();
//        }
//
//        // strategy
//        double price = 100.83;
//        Discounter christmasDiscounter = new ChristmasDiscounter();
//        Discounter eightMarchDiscounter = new EightMarchDiscounter();
//
//        List<Discounter> discounters = new ArrayList<>();
//        discounters.add(christmasDiscounter);
//        discounters.add(eightMarchDiscounter);
////
//        for (Discounter discounter : discounters) {
//            if (discounter.checkCondition()) {
//                discounter.applyDiscount(price);
//            }
//        }
//
//        // prototype
//        Bmw bmw = new Bmw();
//        bmw.setTurboModeOn(true);
//        bmw.setName("BMW 320i");
//        bmw.setMaxSpeed(260);
//
//        Car bmw2 = new Bmw(bmw);
//        System.out.println(bmw2);
//
//        Kia kia = new Kia();
//        kia.setMaxSpeed(230);
//        kia.setBlindZonesControl(true);
//
//        Car kia2 = kia.clone();
//        System.out.println(kia2);
//
//        // prototype via constructor...
//
//        // observer
        WeatherDataCenter weatherDataCenter = new WeatherDataCenter();
        WeatherDataReceiver weatherDataReceiver = new WeatherDataReceiver();
        weatherDataCenter.registerObserver(weatherDataReceiver);
        weatherDataCenter.registerObserver(new WeatherDataReceiver());

        WeatherData weatherData = new WeatherData();
        weatherData.setTemperature(29.3);
        weatherData.setPressure(760.3);
        weatherDataCenter.notifyObservers(weatherData);

        weatherDataCenter.removeObserver(weatherDataReceiver);

        WeatherData wd = new WeatherData();
        wd.setPressure(759.8);
        wd.setTemperature(12.8);
        weatherDataCenter.notifyObservers(wd);
    }
}
