public class DeliveryFeeCalculator {

    public static int calculate(CustomerType customerType, int priceTotal) {
        if (customerType == CustomerType.VIP) {
            return 0;
        }

        if (priceTotal < 10_000) {
            return 2_500;
        }
        return 0;
    }
}
