package product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestOfLargestProducts {
    @Test
    void testOfProducts() {
        int[] numbers = {6,0,2,1,4,4,5,0,9};
        Assertions.assertEquals(20, Main.getLargestProduct(numbers, 2));
        Assertions.assertEquals(80, Main.getLargestProduct(numbers, 4));
        Assertions.assertEquals(160, Main.getLargestProduct(numbers, 5));
        Assertions.assertEquals(9, Main.getLargestProduct(numbers, 1));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 10})
    void testOfEdgeCases(int number) {
        String string = "602144509";
        Assertions.assertFalse(Main.validator(string, number));
    }

    @Test
    void testNumbersGenerator(){
        String string = "602144509";
        int[] numbers = {6,0,2,1,4,4,5,0,9};
        Assertions.assertArrayEquals(numbers, Main.numbersGenerator(string));
    }

}



