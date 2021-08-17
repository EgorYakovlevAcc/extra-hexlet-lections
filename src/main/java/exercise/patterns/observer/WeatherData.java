package exercise.patterns.observer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WeatherData {
    private double temperature;
    private double pressure;
}
