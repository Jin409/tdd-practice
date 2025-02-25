public class DiscountCalculator {
    public static int discount(int priceTotal) {
        if (priceTotal >= 50_000) {
            return 5_000;
        }

        if (priceTotal >= 10_000) {
            return 1_000;
        }
        return 0;
    }
}
