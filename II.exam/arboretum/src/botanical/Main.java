package botanical;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tree oakA = new OakTree("Oak", 10, 20);
        Tree oakB = new OakTree("Oak", 10, 20);
        Tree oakC = new OakTree("Oak", 10, 20);
        Tree pineA = new PineTree("Pine", 10, 20);
        Tree pineB = new PineTree("Pine", 10, 20);
        Tree pineC = new PineTree("Pine", 10, 20);
        Tree cherryA = new CherryTree("Cherry", 10, 20);
        Tree cherryB = new CherryTree("Cherry", 10, 20);
        Tree cherryC = new CherryTree("Cherry", 10, 20);
        Tree mapleA = new MapleTree("Maple", 10, 20);
        Tree mapleB = new MapleTree("Maple", 10, 20);
        Tree mapleC = new MapleTree("Maple", 10, 20);

        List<Tree> oaks = new ArrayList<>();
        oaks.add(oakA);
        oaks.add(oakB);
        oaks.add(oakC);
        System.out.println("List: "+oaks);
        Set<Tree> oakSet = new HashSet<>();
        oakSet.add(oakA);
        oakSet.add(oakB);
        oakSet.add(oakC);
        System.out.println("Set: "+oakSet);

        List<Tree> pines = new ArrayList<>();
        pines.add(pineA);
        pines.add(pineB);
        pines.add(pineC);
        System.out.println("List: "+pines);
        Set<Tree> pineSet = new HashSet<>();
        pineSet.add(pineA);
        pineSet.add(pineB);
        pineSet.add(pineC);
        System.out.println("Set: "+pineSet);

        List<Tree> cherries = new ArrayList<>();
        List<Tree> maples = new ArrayList<>();


    }
}
