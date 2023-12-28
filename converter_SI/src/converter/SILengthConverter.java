package converter;

public enum SILengthConverter {
    MM(1000.0, "mm"),
    CM(100.0, "cm"),
    DM(10.0, "dm"),
    M(1.0, "m"),
    KM(0.001, "km"),
    FEET(3.2808399, "ft"),
    YARD(1.0936133, "yd"),
    MILE(0.000621371192, "mi");

    private final double conversionRate;
    private final String unit;

    private SILengthConverter(double conversionRate, String unit) {
        this.conversionRate = conversionRate;
        this.unit = unit;
    }

    public double convert(SILengthConverter siLengthConverter, double rate) {
        double unit = 1 / siLengthConverter.conversionRate;
        return unit * conversionRate * rate;
    }

    public String getUnit() {
        return unit;
    }
}
