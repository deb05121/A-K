package product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestOfLargestProducts {
    @Test
    void testOfProducts() {
        Assertions.assertEquals(20, Main.getLargestProduct("602144509", 2));
        Assertions.assertEquals(80, Main.getLargestProduct("602144509", 4));
        Assertions.assertEquals(160, Main.getLargestProduct("602144509", 5));
        Assertions.assertEquals(9, Main.getLargestProduct("602144509", 1));
    }


    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 6, 10})
    void testOfEdgeCases(int number) {
        Assertions.assertEquals(-1, Main.getLargestProduct("602144509", number));

    }
}



