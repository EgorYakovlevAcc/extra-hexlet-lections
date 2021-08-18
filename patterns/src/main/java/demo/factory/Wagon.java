package demo.factory;

public class Wagon implements Transport {
    @Override
    public void deliver() {
        System.out.println("WAGON: I deliver an object.");
    }
}
