package exercise.patterns.strategy;

public interface Discounter {
    double applyDiscount(double price);
    boolean checkCondition();
}
