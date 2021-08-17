package exercise.patterns.factory;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("SHIP: I deliver an object.");
    }
}
