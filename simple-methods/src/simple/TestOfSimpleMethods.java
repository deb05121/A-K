package simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

public class TestOfSimpleMethods {
    @ParameterizedTest
    @ValueSource(strings = {"012345", "qwert", "asdfgh", "íyxcvb"})
    void isNotDuplicatedChars(String string){
        Assertions.assertTrue(ThreeEasyMethods.isAllCharactersUnique(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"00","qq","aa","cc", ",,"})
    void isUniqueChars(String string){
        Assertions.assertFalse(ThreeEasyMethods.isAllCharactersUnique(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"papa mama baba mama papa mama", "PAPA MAMA MAMA PAPA MAMA BABA", "Papa paPA mAMA MaMa mamA BabA"})
    void checkPiecesOfWords(String strings){

        Map<String, Integer> frequencies = new HashMap<>();
        frequencies.put("papa", 2);
        frequencies.put("baba", 1);
        frequencies.put("mama", 3);

        Map<String, Integer> result = ThreeEasyMethods.getWordFrequencies(strings);

        Assertions.assertEquals(frequencies, result);
    }

    @ParameterizedTest
    @ValueSource(ints = { 3, 5, 13, 17, 113})
    void checkPrime(int number){
        Assertions.assertTrue(ThreeEasyMethods.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 6, 15, 33, 68, 111})
    void checkIsPrime(int number){
        Assertions.assertFalse(ThreeEasyMethods.isPrime(number));
    }

}
