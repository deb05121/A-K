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
    public void training(Boxer boxer){
        boxer.setPower(experience);
    }
    public void heal(Boxer boxer){
        boxer.setHitPoints(20);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
