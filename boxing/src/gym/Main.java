package gym;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Coach", 55, 3);
        Boxer boxerA = new Boxer("A", 20, 100, 5);
        Boxer boxerB = new Boxer("B", 21, 90, 10);
        Boxer boxerC = new Boxer("C", 22, 80, 15);
        Boxer boxerD = new Boxer("D", 23, 70, 20);
        trainer.training(boxerA);
        trainer.heal(boxerA);
        boolean isNotWinner = true;
        while (isNotWinner) {
            boxerA.setHitPoints(boxerB.getAttackPower());
            if (boxerA.getHitPoints() < 0) {
                isNotWinner = false;
                boxerB.setWins();
                System.out.println(boxerB);
            }
            boxerB.setHitPoints(boxerA.getAttackPower());
            if (boxerB.getHitPoints() < 0) {
                isNotWinner = false;
                boxerA.setWins();
                System.out.println(boxerA);
            }
        }
        trainer.training(boxerC);
        //trainer.heal(boxerD);
        isNotWinner = true;
        while (isNotWinner) {
            boxerC.setHitPoints(boxerD.getAttackPower());
            if (boxerC.getHitPoints() < 0) {
                isNotWinner = false;
                boxerD.setWins();
                System.out.println(boxerD);
            }
            boxerD.setHitPoints(boxerC.getAttackPower());
            if (boxerD.getHitPoints() < 0) {
                isNotWinner = false;
                boxerC.setWins();
                System.out.println(boxerC);
            }
        }
        System.out.println(trainer);
    }
}
