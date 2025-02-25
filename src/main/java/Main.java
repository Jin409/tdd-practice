public class Main {
    public static void main(String[] args) {
        String rawCustomerType = InputView.readCustomerType();
        String rawOrderPrice = InputView.readTotalPrice();

        CustomerType customerType = CustomerType.findByValue(rawCustomerType);

        int orderPrice = Integer.parseInt(rawOrderPrice);
        int discountPrice = calculateDiscountPrice(customerType, orderPrice);
        int deliveryFee = calculateDeliveryFee(customerType, orderPrice);

        int totalOrderPrice = orderPrice - discountPrice + deliveryFee;

        OutputView.printResult(totalOrderPrice, discountPrice, deliveryFee);
    }

    private static int calculateDiscountPrice(CustomerType customerType, int orderPrice) {
        if (customerType == CustomerType.VIP) {
            return calculateDiscountPriceForVIP(orderPrice);
        }

        if (orderPrice >= 50_000) {
            return 5_000;
        }

        if (orderPrice >= 10_000) {
            return 1_000;
        }

        return 0;
    }

    private static int calculateDiscountPriceForVIP(int orderPrice) {

        if (orderPrice >= 50_000) {
            return 5_000;
        }

        if (orderPrice >= 10_000) {
            return 2_000;
        }

        return 0;
    }

    private static int calculateDeliveryFee(CustomerType customerType, int orderPrice) {

        int deliveryFee = 0;

        if (customerType == CustomerType.VIP) {
            return 0;
        }

        if (orderPrice < 10_000) {
            deliveryFee += 2_500;
        }
        return deliveryFee;
    }
}
