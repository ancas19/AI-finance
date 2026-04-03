package co.com.ancas.finance.model.enums;

public enum Constants {
    SYSTEM("SYSTEM");

    private final String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
