import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("고객 유형을 입력하세요 (GENERAL / VIP): ");
        CustomerType customerType = CustomerType.findByValue(scanner.next());

        System.out.println("주문 금액을 입력하세요: ");

        String rawPriceTotal = scanner.next();
        int priceTotal = Integer.parseInt(rawPriceTotal);
        int discountedPrice = DiscountCalculator.discount(customerType, priceTotal);
        int deliveryFee = DeliveryFeeCalculator.calculate(customerType, priceTotal);
        int finalPrice = FinalPriceCalculator.calculate(priceTotal, discountedPrice, deliveryFee);

        System.out.printf("총 주문 금액: %d원%n", finalPrice);
        System.out.printf("적용 할인 금액: %d원%n", discountedPrice);
        System.out.printf("배송비: %d원%n", deliveryFee);
    }
}
