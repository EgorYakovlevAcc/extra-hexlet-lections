package demo.strategy;

public interface Discounter {
    double applyDiscount(double price);
    boolean checkCondition();
}
