package product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Type number line:");
            String value = setNumberLine(scanner);
            System.out.println("Type n:");
            int n = setN(scanner);
            boolean isValidN = validator(value, n);
            int[] numbers = numbersGenerator(value);
            int result = -1;
            if (isValidN) {
                result = getLargestProduct(numbers, n);
            }
            System.out.println("result= " + result);
        }
    }

    public static int[] numbersGenerator(String value) {
        int[] numbers = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(value.charAt(i)));
        }
        return numbers;
    }

    public static boolean validator(String value, int n) {
        return n >= 1 && n <= value.length();
    }

    public static int getLargestProduct(int[] numbers, int n) {
        int max = -1;
        double preProduct = 1;
        for (int j = 0; j < numbers.length - (n - 1); j++) {
            double product = 1;
            if (n > 2 && j > 0 && preProduct > 1) {
                if (numbers[j - 1] != 0) {
                    product = preProduct / numbers[j - 1];
                    product *= numbers[j + (n - 1)];
                } else {
                    break;
                }
            } else {
                for (int k = j; k < (j + n); k++) {
                    if (numbers[k] != 0) {
                        product *= numbers[k];
                    } else {
                        product = 0;
                        break;
                    }
                }
            }
            if (product > max) {
                max = (int) product;
            }
            preProduct = product;
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
