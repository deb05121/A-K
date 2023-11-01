package sieve;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Boolean> indexList = new ArrayList<>();
        for (int i = 1; i < 8000; i++) {
            indexList.add(false);
        }
        indexList.add(0, true);
        indexList.add(1, true);

        int diff = 2;

        while (diff < Math.sqrt(8000)) {

            if (indexList.get(diff)) {
                diff++;
                continue;
            }

            for (int i = 2 * diff; i < 8000; i += diff) {
                if (!indexList.get(diff)) {
                    indexList.set(i, true);
                }

            }
            diff++;
        }
        int piecesOfPrimes = 0;
        int sumOfFirstThousandPrimes=0;
        for (int i = 0; i < 8000; i++) {
            if (!indexList.get(i)) {
                piecesOfPrimes++;
                sumOfFirstThousandPrimes+=i;
                if(piecesOfPrimes==1000){
                    break;
                }
                System.out.println(i + ", " + indexList.get(i));
            }
        }
        System.out.println(sumOfFirstThousandPrimes);
    }


}