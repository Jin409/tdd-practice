public class FinalPriceCalculator {

    public static int calculate(int priceTotal, int discountedPrice, int deliveryFee) {
        return priceTotal - discountedPrice + deliveryFee;
    }
}
