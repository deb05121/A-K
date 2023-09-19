package display;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Scanner;

public class TimeTest {
    @ParameterizedTest
    @ValueSource(ints = {-1, 24, 34, -12})
    void userInputHourNotValid(int nr) {
        Assertions.assertFalse(Main.hoursValidator(nr));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 11, 12, 15, 19, 22, 23})
    void userInputHourValid(int nr) {
        Assertions.assertTrue(Main.hoursValidator(nr));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -10, 60, 78})
    void userInputMinuteNotValid(int nr) {
        Assertions.assertFalse(Main.minutesValidator(nr));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 12, 19, 59})
    void userInputMinuteValid(int nr) {
        Assertions.assertTrue(Main.minutesValidator(nr));
    }

    @Test
    void outputStringTest() {
        Assertions.assertEquals("It is noon.", Main.outputString(12, 0));
        Assertions.assertEquals("It is twenty past three.", Main.outputString(15, 20));
        Assertions.assertEquals("It is twenty-five to three.", Main.outputString(14, 35));
        Assertions.assertEquals("It is five o'clock.", Main.outputString(17, 0));
        Assertions.assertEquals("It is half past five.", Main.outputString(17, 30));
        Assertions.assertEquals("It is quarter past nine.", Main.outputString(9, 15));
        Assertions.assertEquals("It is quarter to ten.", Main.outputString(9, 45));
        Assertions.assertEquals("It is ten past ten.", Main.outputString(10, 10));
        Assertions.assertEquals("It is midnight.", Main.outputString(0, 0));

        Assertions.assertEquals("It is ten to eight.", Main.outputString(7, 50));

    }
}
