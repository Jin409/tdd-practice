public class FinalPriceCalculator {

    // TODO: 파라미터로 빼기
    public static int calculate(String customerType, int priceTotal) {
        int discount = DiscountCalculator.discount(customerType, priceTotal);
        int deliveryFee = DeliveryFeeCalculator.calculate(customerType, priceTotal);
        return priceTotal - discount + deliveryFee;
    }
}
