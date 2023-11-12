package gym;

import java.util.Objects;

public class Boxer{
    private String name;
    private int age;
    private int hitPoints;
    private int power;
    private Integer wins;

    public Boxer() {

    }

    public Boxer(String name, int age, int hitPoints, int power) {
        this.name = name;
        this.age = age;
        this.hitPoints = hitPoints;
        this.power = power;
        wins = 0;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins() {
        this.wins++;
    }

    public int getAttackPower() {
        return power;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setPower(int power) {
        this.power += power;
    }

    public void setHitPoints(int power) {
        this.hitPoints -= power;
    }

    @Override
    public String toString() {
        return "\nBoxer\n" +
                "+-------------------\n" +
                "|name=  " + name + "\n" +
                "|age=   " + age + "\n" +
                "|wins=  " + wins + "\n" +
                "+-------------------";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boxer boxer = (Boxer) o;
        return age == boxer.age && hitPoints == boxer.hitPoints && power == boxer.power && Objects.equals(wins, boxer.wins) && Objects.equals(name, boxer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hitPoints, power, wins);
    }


}
