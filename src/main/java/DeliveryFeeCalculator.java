public class DeliveryFeeCalculator {

    public static int calculate(int priceTotal) {
        if (priceTotal < 10_000) {
            return 2_500;
        }
        return 0;
    }
}
