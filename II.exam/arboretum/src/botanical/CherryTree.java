package botanical;

public class CherryTree extends Tree{

    public CherryTree(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    String getDescription() {
        return String.format("A cherry is the fruit of many plants of the genus Prunus, and is a fleshy drupe (stone fruit). Name of this tree is %s age is %d and height is %d\n", this.name, this.age, this.height);
    }

    @Override
    String getHungarianName() {
        return "cseresznyefa";
    }

    @Override
    void bloom() {
        System.out.println("The cherry tree is blooming");
    }
}
