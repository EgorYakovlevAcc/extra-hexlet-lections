package demo.strategy;

import java.util.Calendar;

public class EightMarchDiscounter implements Discounter {
    @Override
    public double applyDiscount(double price) {
        System.out.println("EightMarchDiscounter has been applied");
        return price * 0.75;
    }

    @Override
    public boolean checkCondition() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        long currentDate = calendar.getTimeInMillis();
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        long eightMarchDate = calendar.getTimeInMillis();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        long startEightMarchDiscountDate = calendar.getTimeInMillis();

        return currentDate >= startEightMarchDiscountDate && currentDate <= eightMarchDate;
    }
}
