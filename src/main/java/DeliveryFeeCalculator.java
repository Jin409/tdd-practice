public class DeliveryFeeCalculator {

    public static int calculate(String customerType, int priceTotal) {
        if (customerType.equals("VIP")) {
            return 0;
        }

        if (priceTotal < 10_000) {
            return 2_500;
        }
        return 0;
    }
}
