import java.util.Arrays;

public enum CustomerType {
    GENERAL("GENERAL"),
    VIP("VIP");

    private final String value;

    CustomerType(String value) {
        this.value = value;
    }

    public static CustomerType findByValue(String value) {
        return Arrays.stream(CustomerType.values())
                .filter(type -> type.value.equals(value))
                .findAny()
                .orElse(null);
    }
}
