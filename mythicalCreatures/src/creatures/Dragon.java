package creatures;

public class Dragon extends MythicalCreature {
    private int power;

    public Dragon() {
        super();
    }

    public Dragon(String name, CreatureType type, int power) {
        super(name, type);

        this.power = power;

    }

    @Override
    void introduce(String name) {
        System.out.printf("Hello, I am a DRAGON and my name is %s.%n", name);
    }

    void attack(MythicalCreature c, String name           ) {
        System.out.printf("%s has attacked %s with %d!%n", name, c, power);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "power=" + power +
                "} " + super.toString() +"\n";
    }
}