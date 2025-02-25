public class DiscountCalculator {
    public static int discount(CustomerType customerType, int priceTotal) {
        if (customerType == CustomerType.VIP) {
            if (priceTotal >= 50_000) {
                return 5_000;
            }
            if (priceTotal >= 10_000) {
                return 2_000;
            }
        }

        if (priceTotal >= 50_000) {
            return 5_000;
        }

        if (priceTotal >= 10_000) {
            return 1_000;
        }
        return 0;
    }
}
