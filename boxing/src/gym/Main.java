package gym;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Coach", 55, 7);
        Gym newGym = new Gym(trainer);
        Boxer boxerA = new Boxer("A", 20, 110, 45);
        newGym.setBoxers(boxerA);
        Boxer boxerB = new Boxer("B", 21, 100, 10);
        newGym.setBoxers(boxerB);
        Boxer boxerC = new Boxer("C", 22, 80, 15);
        newGym.setBoxers(boxerC);
        Boxer boxerD = new Boxer("D", 23, 70, 20);
        newGym.setBoxers(boxerD);
        Boxer boxerE = new Boxer("E", 24, 60, 25);
        newGym.setBoxers(boxerE);
        for (Boxer b : newGym.boxers) {
            for (int i = 0; i < 3; i++) {
                trainer.training(b);
            }
        }
        for (int i = 0; i < 5; i++) {
            Boxer bxrX = newGym.getBoxers(i);
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    continue;
                }
                Boxer bxrY = newGym.getBoxers(j);
                boolean isNotWinner = true;
                while (isNotWinner) {
                    if (!bxrX.equals(bxrY)) {
                        bxrY.setHitPoints(bxrX.getAttackPower());
                        if (bxrY.getHitPoints() < 1) {
                            bxrX.setWins();
                            break;
                        }
                        bxrX.setHitPoints(bxrY.getAttackPower());
                        if (bxrX.getHitPoints() < 1) {
                            isNotWinner = false;
                            bxrY.setWins();
                        }
                    }
                }
                for (int k = 0; k < 6; k++) {
                    trainer.heal(bxrX);
                    trainer.heal(bxrY);
                }
            }
        }
        Integer max = 0;
        for (Boxer bxr : newGym.boxers) {
            System.out.println(bxr);
            if (max < bxr.getWins()) {
                max = bxr.getWins();
            }
        }
        System.out.println("\nWinners:");
        for (Boxer b: newGym.boxers) {
            if(Objects.equals(max, b.getWins())){
                System.out.println(b);
            }
        }
    }
}
