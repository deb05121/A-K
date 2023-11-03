package botanical;

import java.util.Objects;

public abstract class Tree {
    String name;
    int age;
    int height;

    abstract String getDescription();

    abstract String getHungarianName();

    abstract void bloom();

    @Override
    public String toString() {
        return String.format("An age of %d name of %s is bloom", age, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return age == tree.age && height == tree.height && Objects.equals(name, tree.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}
