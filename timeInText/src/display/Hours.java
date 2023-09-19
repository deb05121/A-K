package display;

public class Hours {
    private int hours;
    private static String[] hoursNames ={"o", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "noon", "midnight"};

    public Hours(){

    }
    public Hours(int hours) {
        this.hours = hours;
    }

    public String getHoursName(){
        return hoursNames[this.hours];
    }
}
