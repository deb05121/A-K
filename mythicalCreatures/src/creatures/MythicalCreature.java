package creatures;

public abstract class MythicalCreature {
    private final String name;
    private CreatureType type;

    public String getName() {
        return name;
    }


    public MythicalCreature(String name, CreatureType type) {
        this.name = name;
        this.type = type;
    }

    public MythicalCreature() {
        name = "John";
    }


    void introduce(String name) {
        System.out.println("Hello, I am a mythical creature and my name is " + name);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
