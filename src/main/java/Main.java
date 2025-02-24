import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawOrderPrice = scanner.next();
        int orderPrice = Integer.parseInt(rawOrderPrice);
        int discountPrice = calculateDiscountPrice(orderPrice);
        int deliveryFee = calculateDeliveryFee(orderPrice);

        System.out.printf("총 주문 금액: %d원%n", orderPrice - discountPrice + deliveryFee);
        System.out.printf("적용 할인 금액: %d원%n", discountPrice);
        System.out.printf("배송비: %d원%n", deliveryFee);
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
