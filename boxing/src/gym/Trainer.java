package gym;

public class Trainer {
    private final String name;
    private final int age;
    private final int experience;

    public Trainer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
    public void train(Boxer boxer){
        boxer.addHitPoints(experience);
    }
    public void heal(Boxer boxer){
        boxer.addPower(20);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "\nname='" + name + '\'' +
                ", \nage=" + age +
                ", \nexperience=" + experience +
                '}';
    }
}
