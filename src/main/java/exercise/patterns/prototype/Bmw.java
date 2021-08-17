package exercise.patterns.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bmw implements Car {
    private int maxSpeed;
    private String name;
    private boolean isTurboModeOn;

    public Bmw(Bmw bmw) {
        this.name = bmw.getName();
        this.maxSpeed = bmw.getMaxSpeed();
        this.isTurboModeOn =  bmw.isTurboModeOn();
    }

    public Bmw() {
    }

    @Override
    public Car clone() {
        Bmw bmw = new Bmw();
        bmw.setMaxSpeed(this.getMaxSpeed());
        bmw.setName(this.getName());
        bmw.setTurboModeOn(this.isTurboModeOn());
        return bmw;
    }
}
