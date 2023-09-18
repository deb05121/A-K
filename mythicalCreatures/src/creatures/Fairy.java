package creatures;

public class Fairy extends MythicalCreature {
    private int healingPower;

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    public Fairy(String name, CreatureType type, int power) {
        super(name, type);
        setHealingPower(power);
    }

    @Override
    void introduce(String name) {
        System.out.printf("Hello, I am a FAIRY and my name is %s.%n", name);
    }

    void heal(MythicalCreature c, String name) {
        System.out.printf("%s has healed %s with %d hit points!%n", name, c, healingPower);
    }

    @Override
    public String toString() {
        return "Fairy{" +
                "healingPower=" + healingPower +
                "} " + super.toString() + "\n";
    }
}

