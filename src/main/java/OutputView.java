public class OutputView {
    public static void printResult(int totalPrice, int discountPrice, int deliveryFee) {
        System.out.printf("총 주문 금액: %d원%n", totalPrice);
        System.out.printf("적용 할인 금액: %d원%n", discountPrice);
        System.out.printf("배송비: %d원%n", deliveryFee);
    }
}
