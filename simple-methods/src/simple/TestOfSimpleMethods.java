package simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestOfSimpleMethods {
    @ParameterizedTest
    @ValueSource(strings = {"012345", "qwert", "asdfgh", "íyxcvb"})
    void isNotDuplicatedChars(String string) {
        Assertions.assertTrue(ThreeEasyMethods.isAllCharactersUnique(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"00", "qq", "aa", "cc", ",,"})
    void isUniqueChars(String string) {
        Assertions.assertFalse(ThreeEasyMethods.isAllCharactersUnique(string));
    }

    @ParameterizedTest
    @MethodSource("checkWordFrequencies")
    void testStringFrequencies(List<String> stringList) {
        Assertions.assertTrue(provideWordFrequencies().equals(ThreeEasyMethods.getStringFrequencies(stringList)));
    }

    Map<String, Integer> provideWordFrequencies() {
        Map<String, Integer> frequencies = new HashMap<>();
        frequencies.put("feri", 2);
        frequencies.put("tomi", 1);
        frequencies.put("kati", 3);
        return frequencies;
    }

    static Stream<List<String>> checkWordFrequencies() {
        return Stream.of(
                List.of("Kati", "Feri", "Tomi", "Feri", "Kati", "Kati"),
                List.of("FeRi", "TomI", "FEri", "KaTi", "kati", "kATI"),
                List.of("FERI", "Feri", "KATI", "Kati", "Tomi", "Kati")
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {"papa mama baba mama papa mama", "PAPA MAMA MAMA PAPA MAMA BABA", "Papa paPA mAMA MaMa mamA BabA"})
    void checkPiecesOfWords(String strings) {

        Map<String, Integer> frequencies = new HashMap<>();
        frequencies.put("papa", 2);
        frequencies.put("baba", 1);
        frequencies.put("mama", 3);

        Map<String, Integer> result = ThreeEasyMethods.getWordFrequencies(strings);

        Assertions.assertEquals(frequencies, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293})
    void checkPrime(int number) {
        Assertions.assertTrue(ThreeEasyMethods.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1, 6, 15, 33, 68, 111})
    void checkNoPrime(int number) {
        Assertions.assertFalse(ThreeEasyMethods.isPrime(number));
    }

}
