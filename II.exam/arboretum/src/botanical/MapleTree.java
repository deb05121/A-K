package botanical;

public class MapleTree extends Tree {
    public MapleTree() {

    }
    public MapleTree(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    String getDescription() {
        return String.format("Acer is a genus of trees and shrubs commonly known as maples. Name of this tree is %s age is %d and height is %d\n", this.name, this.age, this.height);
    }

    @Override
    String getHungarianName() {
        return "juharfa";
    }

    @Override
    void bloom() {
        System.out.println("The maple tree is blooming");
    }

    @Override
    public String toString() {
        return "MapleTree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                "} " + super.toString();
    }
}
