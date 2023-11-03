package botanical;

public class OakTree extends Tree{

    public OakTree(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    String getDescription() {
        return String.format("An oak is a hardwood tree or shrub in the genus Quercus of the beech family. Name of this tree is %s age is %d and height is %d\n", this.name, this.age, this.height);
    }

    @Override
    String getHungarianName() {
        return "tölgyfa";
    }

    @Override
    void bloom() {
        System.out.println("The oak tree is blooming");
    }
}
