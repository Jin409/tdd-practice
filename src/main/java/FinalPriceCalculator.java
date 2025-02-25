public class FinalPriceCalculator {

    public static int calculate(int priceTotal) {
        int discount = DiscountCalculator.discount(priceTotal);
        int deliveryFee = DeliveryFeeCalculator.calculate(priceTotal);
        return priceTotal - discount + deliveryFee;
    }
}
