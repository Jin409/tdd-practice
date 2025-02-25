import java.util.Arrays;
import java.util.function.Function;

public enum CustomerType {
    GENERAL("GENERAL", (orderPrice) -> {
        if (orderPrice >= 50_000) {
            return 5_000;
        }
        if (orderPrice >= 10_000) {
            return 1_000;
        }
        return 0;
    }, (orderPrice) -> {
        if (orderPrice < 10_000) {
            return 2_500;
        }
        return 0;
    }),
    VIP("VIP", (orderPrice) -> {
        if (orderPrice >= 50_000) {
            return 5_000;
        }
        if (orderPrice >= 10_000) {
            return 2_000;
        }
        return 0;
    }, (orderPrice) -> {
        return 0;
    });

    private final String value;
    private final Function<Integer, Integer> discountPolicy;
    private final Function<Integer, Integer> deliveryFeeDiscountPolicy;

    CustomerType(String value, Function<Integer, Integer> discountPolicy,
                 Function<Integer, Integer> deliveryFeeDiscountPolicy) {
        this.value = value;
        this.discountPolicy = discountPolicy;
        this.deliveryFeeDiscountPolicy = deliveryFeeDiscountPolicy;
    }

    public static CustomerType findByValue(String value) {
        return Arrays.stream(CustomerType.values())
                .filter(type -> type.value.equals(value))
                .findAny()
                .orElse(null);
    }

    public int discount(int orderPrice) {
        return discountPolicy.apply(orderPrice);
    }

    public int discountDeliveryFee(int orderPrice) {
        return deliveryFeeDiscountPolicy.apply(orderPrice);
    }
}
