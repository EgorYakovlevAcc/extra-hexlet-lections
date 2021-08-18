package demo.strategy;

import java.util.Calendar;

public class ChristmasDiscounter implements Discounter {

    @Override
    public double applyDiscount(double price) {
        System.out.println("ChristmasDiscounter has been applied.");
        return price * 0.5;
    }

    @Override
    public boolean checkCondition() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 5);
        long currentDate = calendar.getTimeInMillis();
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        long eightMarchDate = calendar.getTimeInMillis();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        long startChristmasDiscountDate = calendar.getTimeInMillis();

        return currentDate >= startChristmasDiscountDate && currentDate <= eightMarchDate;
    }
}
