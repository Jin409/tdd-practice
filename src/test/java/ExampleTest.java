import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    @DisplayName("10000원 이상 주문 시 1000원을 할인한다")
    void test1() {
        // given
        int priceTotal = 10000;

        // when & then
        assertThat(DiscountCalculator.discount("", priceTotal)).isEqualTo(1000);
    }

    @Test
    @DisplayName("50000원 이상 주문 시 5000원을 할인한다")
    void test2() {
        // given
        int priceTotal = 50000;

        // when & then
        assertThat(DiscountCalculator.discount("", priceTotal)).isEqualTo(5000);
    }

    @Test
    @DisplayName("10000원 미만 주문 시 배송비는 2500원이다")
    void test3() {
        // given
        int priceTotal = 9000;

        // when & then
        assertThat(DeliveryFeeCalculator.calculate("", priceTotal)).isEqualTo(2500);
    }

    @Test
    @DisplayName("10000원 이상 주문 시 배송비는 0원이다")
    void test4() {
        // given
        int priceTotal = 10000;

        // when & then
        assertThat(DeliveryFeeCalculator.calculate("", priceTotal)).isEqualTo(0);
    }

    @Test
    @DisplayName("총 주문 금액을 계산한다")
    void test5() {
        // given
        int priceTotal = 15000;

        // when & then
        assertThat(FinalPriceCalculator.calculate("", priceTotal)).isEqualTo(14000);
    }

    @Test
    @DisplayName("VIP 가 10000원 이상 주문 시 2000원을 할인한다")
    void test6() {
        // given
        int priceTotal = 15000;

        // when & then
        assertThat(DiscountCalculator.discount("VIP", priceTotal)).isEqualTo(2000);
    }

    @Test
    @DisplayName("VIP 가 50000원 이상 주문 시 5000원을 할인한다")
    void test7() {
        // given
        int priceTotal = 50000;

        // when & then
        assertThat(DiscountCalculator.discount("VIP", priceTotal)).isEqualTo(5000);
    }

    @Test
    @DisplayName("VIP 의 배송비는 무료이다")
    void test8() {
        // given
        int priceTotal = 15000;

        // when & then
        assertThat(DeliveryFeeCalculator.calculate("VIP", priceTotal)).isEqualTo(0);
    }

    @Test
    @DisplayName("VIP 의 총 주문 금액을 계산한다")
    void test9() {
        // given
        int priceTotal = 60000;

        // when & then
        assertThat(FinalPriceCalculator.calculate("VIP", priceTotal)).isEqualTo(55000);
    }


}
