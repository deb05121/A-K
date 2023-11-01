package third;

import java.util.ArrayList;
import java.util.List;

public class Amstrong {
    public static void main(String[] args) {
        int number = 370;
        boolean isAmstrongNumber = isAmstrongNumber(number);
        if (isAmstrongNumber) {
            System.out.printf("%d is an Amstrong number.\n", number);
        } else {
            System.out.printf("%d isn't an Amstrong number.\n", number);
        }
        int from = 1;
        int to = 1000;
        double sumOfAmstrongs = getAmstrongNumbers(from, to);
        double sumOfPrimes = getPrimes(from, to);
        double ratio = sumOfAmstrongs/sumOfPrimes;
        System.out.printf("Ratio of sumOfAmstrongs and sumOfPrimes from 1 to 1000: %.5f", ratio);
    }

    private static int getPrimes(int from, int to) {
        int sumOfPrimes = 2;
        boolean isPrime;
        for (int i = 2; i <= to; i++) {
            isPrime = true;
            for (int j = 2; j < Math.sqrt(i)+1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sumOfPrimes+=i;
                //System.out.println(i);
            }
        }
        return sumOfPrimes;
    }

    private static int getAmstrongNumbers(int from, int to) {
        List<Integer> numbersOfAmstrong = new ArrayList<>();
        boolean isAmstrong = false;
        int sumOfAmstorngs = 0;
        for (int j = from; j <= to; j++) {
            isAmstrong = isAmstrongNumber(j);
            if (isAmstrong) {
                numbersOfAmstrong.add(j);
                sumOfAmstorngs += j;
            }
        }
        System.out.println(numbersOfAmstrong);
        return sumOfAmstorngs;
    }

    private static boolean isAmstrongNumber(int number) {
        String str = String.valueOf(number);
        int len = str.length();
        int sumOfAmstrong = 0;
        for (int i = 0; i < len; i++) {
            String s = String.valueOf(str.charAt(i));
            int digit = Integer.parseInt(s);
            sumOfAmstrong += digit * digit * digit;
        }
        return number == sumOfAmstrong;
    }
}
