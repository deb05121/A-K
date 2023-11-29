package traffic;

public class TrafficLight {
    private String yellow;
    private String red;
    private String green;

    public TrafficLight() {
        red = "*";
        yellow = "S";
        green = "*";
    }

    public boolean isFree() {
        if(green.equals("Z")){
            return true;
        }
        return false;
    }

    public void transition() {
        if (red.equals("*") && yellow.equals("S")) {
            yellow = "*";
            red = "P";
        } else if (red.equals("P") && yellow.equals("*")) {
            yellow = "S";
        } else if (red.equals("P") && yellow.equals("S")) {
            red = "*";
            yellow = "*";
            green = "Z";
        } else {
            green = "*";
            yellow = "S";
        }
    }

    @Override
    public String toString() {
        return "TrafficLight\n" +
                red + "\n" +
                yellow + "\n" +
                green ;
    }
}
