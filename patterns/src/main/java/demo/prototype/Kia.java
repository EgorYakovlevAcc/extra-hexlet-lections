package demo.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Kia implements Car {
    private int maxSpeed;
    private boolean isBlindZonesControl;

    @Override
    public Car clone() {
        Kia kia = new Kia();
        kia.setBlindZonesControl(this.isBlindZonesControl());
        kia.setMaxSpeed(this.getMaxSpeed());
        return kia;
    }
}
