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
        Tree cherryC = new CherryTree("Cherry", 20, 10);
        Tree mapleA = new MapleTree("Maple", 10, 20);
        Tree mapleB = new MapleTree("Maple", 10, 20);
        Tree mapleC = new MapleTree("Maple", 20, 10);

        List<Tree> oaks = new ArrayList<>();
        oaks.add(oakA);
        oaks.add(oakB);
        oaks.add(oakC);
        System.out.println("List: " + oaks);
        Set<Tree> oakSet = new HashSet<>();
        oakSet.add(oakA);
        oakSet.add(oakB);
        oakSet.add(oakC);
        System.out.println("Set: " + oakSet);

        List<Tree> pines = new ArrayList<>();
        pines.add(pineA);
        pines.add(pineB);
        pines.add(pineC);
        System.out.println("List: " + pines);
        Set<Tree> pineSet = new HashSet<>();
        pineSet.add(pineA);
        pineSet.add(pineB);
        pineSet.add(pineC);
        System.out.println("Set: " + pineSet);

        List<Tree> cherries = new ArrayList<>();
        cherries.add(cherryA);
        cherries.add(cherryB);
        cherries.add(cherryC);
        System.out.println("List: " + cherries);
        Set<Tree> cherrySet = new HashSet<>();
        cherrySet.add(cherryA);
        cherrySet.add(cherryB);
        cherrySet.add(cherryC);
        System.out.println("Set: " + cherrySet);

        List<Tree> maples = new ArrayList<>();
        maples.add(mapleA);
        maples.add(mapleB);
        maples.add(mapleC);
        System.out.println("List: " + maples);
        Set<Tree> mapleSet = new HashSet<>();
        mapleSet.add(mapleA);
        mapleSet.add(mapleB);
        mapleSet.add(mapleC);
        System.out.println("Set: " + mapleSet);

        System.out.println(oakA.getDescription());
        System.out.println(pineA.getDescription());
        System.out.println(cherryA.getDescription());
        System.out.println(mapleA.getDescription());
    }
}
