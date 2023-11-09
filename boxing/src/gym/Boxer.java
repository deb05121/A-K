package gym;

public class Boxer {
    private String name;
    private int age;
    private int hitPoints;
    private int power;
    private int wins;

    public Boxer() {

    }

    public Boxer(String name, int age, int hitPoints, int power) {
        this.name = name;
        this.age = age;
        this.hitPoints = hitPoints;
        this.power = power;
        wins = 0;
    }

    public void setWins() {
        this.wins++;
    }

    public int getAttackPower() {
        return power*(-1);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setPower(int power) {
        this.power += power;
    }

    public void setHitPoints(int power) {
        this.hitPoints += power;
    }

    @Override
    public String toString() {
        return "Winner\n" +
                "+-------------------\n" +
                "|name=  " + name + "\n" +
                "|age=   " + age +"\n"+
                "|wins=  " + wins+"\n" +
                "+-------------------";
    }
}
