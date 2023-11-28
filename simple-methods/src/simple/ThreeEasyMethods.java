package simple;

import java.util.*;

public class ThreeEasyMethods {

    public static boolean isAllCharactersUnique(String string) {
        int len = string.length();
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < len; i++) {
            characterSet.add(string.charAt(i));
        }
        return characterSet.size() == len;
    }

    public static Map<String, Integer> getWordFrequencies(String string) {
        Map<String, Integer> wordAndPieces = new HashMap<>();
        String[] words = string.split(" ");
        for (String str : words) {
            String word = str.toLowerCase();
            if (wordAndPieces.containsKey(word)) {
                wordAndPieces.put(word, wordAndPieces.get(word) + 1);
            } else {
                wordAndPieces.put(word, 1);
            }
        }
        return wordAndPieces;
    }

    public static boolean isPrime(int userNumber) {
        int border = (int) Math.sqrt(userNumber) + 1;
        for (int i = 2; i < border; i++) {
            if(userNumber%i==0){
                return false;
            }
        }
        return true;
    }

}
