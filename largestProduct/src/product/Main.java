package product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Type number line:");
            String value = setNumberLine(scanner);
            System.out.println("Type n:");
            int n = setN(scanner);

            int result = getLargestProduct(value, n);
            System.out.println(result);
        }
    }

    public static int getLargestProduct(String value, int n) {
        int max = -1;
        if (n < 1 || n > value.length()) {
            return max;
        }
        int[] numbers = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(value.charAt(i)));

        }
        for (int j = 0; j < value.length() - (n - 1); j++) {
            int product = 1;
            for (int k = j; k < j + (n); k++) {
                product *= numbers[k];
            }
            if (product > max) {
                max = product;
            }
        }
        if (max == 0) {
            max = -1;
        }
        return max;
    }

    public static int setN(Scanner scanner) {
        return scanner.nextInt();
    }

    public static String setNumberLine(Scanner scanner) {
        return scanner.nextLine();
    }
}
