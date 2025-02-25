public class Main {
    public static void main(String[] args) {
        String rawOrderPrice = InputView.readTotalPrice();
        int orderPrice = Integer.parseInt(rawOrderPrice);
        int discountPrice = calculateDiscountPrice(orderPrice);
        int deliveryFee = calculateDeliveryFee(orderPrice);

        int totalOrderPrice = orderPrice - discountPrice + deliveryFee;

        OutputView.printResult(totalOrderPrice, discountPrice, deliveryFee);
    }

    private static int calculateDiscountPrice(int orderPrice) {
        int discountPrice = 0;
        if (orderPrice >= 10_000) {
            discountPrice += 1_000;
        }

        if (orderPrice >= 50_000) {
            discountPrice += 5_000;
        }
        return discountPrice;
    }

    private static int calculateDeliveryFee(int orderPrice) {
        int deliveryFee = 0;
        if (orderPrice < 10_000) {
            deliveryFee += 2_500;
        }
        return deliveryFee;
    }
}
