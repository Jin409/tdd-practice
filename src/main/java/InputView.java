import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readTotalPrice() {
        System.out.print("주문 금액을 입력하세요: ");
        return SCANNER.next();
    }

    public static String readCustomerType() {
        System.out.print("고객 유형을 입력하세요 (GENERAL / VIP):");
        return SCANNER.next();
    }
}
