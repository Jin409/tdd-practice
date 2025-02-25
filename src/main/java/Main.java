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
            return CustomerType.VIP.discount(orderPrice);
        }
        return CustomerType.GENERAL.discount(orderPrice);
    }

    private static int calculateDeliveryFee(CustomerType customerType, int orderPrice) {
        if (customerType == CustomerType.VIP) {
            return CustomerType.VIP.discountDeliveryFee(orderPrice);
        }
        return CustomerType.GENERAL.discountDeliveryFee(orderPrice);
    }
}
}
