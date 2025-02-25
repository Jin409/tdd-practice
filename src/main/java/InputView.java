import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readTotalPrice() {
        System.out.println("주문 금액을 입력하세요: ");
        return SCANNER.next();
    }
}
