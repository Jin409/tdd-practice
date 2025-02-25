import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("주문 금액을 입력하세요: ");

        String rawPriceTotal = scanner.next();
        int priceTotal = Integer.parseInt(rawPriceTotal);
        int discount = DiscountCalculator.discount(priceTotal);
        int deliveryFee = DeliveryFeeCalculator.calculate(priceTotal);
        int finalPrice = FinalPriceCalculator.calculate(priceTotal);

        System.out.printf("총 주문 금액: %d원%n", finalPrice);
        System.out.printf("적용 할인 금액: %d원%n", discount);
        System.out.printf("배송비: %d원%n", deliveryFee);
    }
}
