package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.
        System.out.println("Type a string:");
        boolean isUniqueChars = ThreeEasyMethods.isAllCharactersUnique(scanner.nextLine());
        System.out.printf("Your string has just unique characters? %s \n", isUniqueChars);
        //2.
        System.out.println("Type the next string:");
        Map<String, Integer> result = ThreeEasyMethods.getWordFrequencies(scanner.nextLine());
        System.out.println(result);

        //2/a.
        System.out.println("Type some strings. How many words do you want?");
        int wordNr = scanner.nextInt();
        scanner.nextLine();
        List<String> stringList = new ArrayList<>();
        while (wordNr > 0) {
            stringList.add(scanner.nextLine());
            wordNr--;
        }
        Map<String, Integer> wordsMap = ThreeEasyMethods.getStringFrequencies(stringList);
        System.out.println(wordsMap);

        //3.
        System.out.println("Type a number:");
        boolean isPrime = ThreeEasyMethods.isPrime(scanner.nextInt());
        System.out.printf("Is your number prime? %s", isPrime);

    }
}
