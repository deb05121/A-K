package creatures;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MythicalCreature> creaturesList = new ArrayList<>();

        Dragon orangeDragon = new Dragon("Orange", CreatureType.FIRE, 25);
        Dragon redDragon = new Dragon("Red", CreatureType.FIRE, 75);
        Dragon blueDragon = new Dragon("Blue", CreatureType.ICE, 50);
        Fairy riverFairy = new Fairy("River", CreatureType.ICE,20);
        Fairy lakeFairy= new Fairy("Lake", CreatureType.ICE, 40);
        Fairy seaFairy= new Fairy("Sea", CreatureType.ICE, 60);

        creaturesList.add(orangeDragon);
        creaturesList.add(redDragon);
        creaturesList.add(blueDragon);
        creaturesList.add(riverFairy);
        creaturesList.add(lakeFairy);
        creaturesList.add(seaFairy);

        System.out.println(creaturesList);

        MythicalCreature john = new Dragon();

        orangeDragon.introduce(orangeDragon.getName());
        orangeDragon.attack(john, orangeDragon.getName());
        redDragon.introduce(redDragon.getName());
        redDragon.attack(john, redDragon.getName());
        blueDragon.introduce(blueDragon.getName());
        blueDragon.attack(john, blueDragon.getName());
        riverFairy.introduce(riverFairy.getName());
        riverFairy.heal(john, riverFairy.getName());
        lakeFairy.introduce(lakeFairy.getName());
        lakeFairy.heal(john, lakeFairy.getName());
        seaFairy.introduce(seaFairy.getName());
        seaFairy.heal(john, seaFairy.getName());
    }
}