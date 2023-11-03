package botanical;

public class PineTree extends Tree{

    public PineTree(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    String getDescription() {
        return String.format("A pine is any conifer tree or shrub in the genus Pinus of the family Pinaceae. Name of this tree is %s age is %d and height is %d\n", this.name, this.age, this.height);
    }

    @Override
    String getHungarianName() {
        return "fenyőfa";
    }

    @Override
    void bloom() {
        System.out.println("The pine tree is blooming");
    }
}
