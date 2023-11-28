package simple;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.
        System.out.println("Type a string:");
        boolean isUniqueChars = ThreeEasyMethods.isAllCharactersUnique(scanner.nextLine());
        System.out.printf("Your string has just unique characters? %s \n",isUniqueChars );
        //2.
        System.out.println("Type the next string:");
        Map<String, Integer> result = ThreeEasyMethods.getWordFrequencies(scanner.nextLine());
        System.out.println(result);
        //3.
        System.out.println("Type a number:");
        boolean isPrime =  ThreeEasyMethods.isPrime(scanner.nextInt());
        System.out.printf("Is your number prime? %s",isPrime);


    }
}
