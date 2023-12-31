package magyar;

import java.util.ArrayList;
import java.util.List;

public class Szavak {

    public static void main(String[] args) {
        String str = "Ez egy néhány szavas rövid mondat Janitól tömören.";
        boolean valid = validator(str);
        System.out.println("");

    }

    private static boolean validator(String str) {
        boolean valid = true;
        String[] words = str.split(" ");
        int hunWordsPieces = 0;
        for (String s : words) {
            if (s.matches("[a-zöüóőúűéáí]+")) {
                hunWordsPieces++;
            } else {
                System.out.println(s);
                valid=false;
            }
        }
        System.out.printf("Valid magyar szavak száma: %d\n", hunWordsPieces);
        return true;
    }
}
