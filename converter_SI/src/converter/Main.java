package converter;

public class Main {

    public static void main(String[] args) {
        double meters = 1;
        for (SILengthConverter sILengthConverter : SILengthConverter.values()) {
            System.out.print(meters + " m = " + sILengthConverter.convert(SILengthConverter.M, meters) + " " + sILengthConverter.getUnit() + "\n");
        }

        System.out.println();
        double yard = 10;
        for (SILengthConverter sILengthConverter : SILengthConverter.values()) {
            System.out.printf("%.1f %s %.5f %s \n", yard, "yd =", sILengthConverter.convert(SILengthConverter.YARD, yard), sILengthConverter.getUnit());
        }

        System.out.println();
        double feet = 3;
        for (SILengthConverter sILengthConverter : SILengthConverter.values()) {
            System.out.printf("%.1f %s %.3f %s \n", feet, "ft =", sILengthConverter.convert(SILengthConverter.FEET, feet), sILengthConverter.getUnit());
        }

    }
}

