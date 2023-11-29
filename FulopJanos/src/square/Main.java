package square;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type a positive number: ");
        int userNr = scanner.nextInt();
        List<Integer> squareNrList = new ArrayList<>();
        int squareNr = 1;
        int i = 1;
        boolean less = true;
        do {
            squareNr = i * i++;
            if (squareNr < userNr) {
                squareNrList.add(squareNr);

            } else {
                less = false;
            }
        } while (less);
        for (int j = squareNrList.size() - 1; j >= 0; j--) {
            System.out.println(squareNrList.get(j));

        }
        scanner.close();
    }
}
