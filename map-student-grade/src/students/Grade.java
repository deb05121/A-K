package students;

public enum Grade {
    EXCELLENT(5), GOOD(4), MEDIUM(3), ACCEPTABLE(2), FAIL(1);
    private final int value;

    Grade( int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
