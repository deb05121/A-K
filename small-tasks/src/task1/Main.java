package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wordListA = new ArrayList<>();
        wordListA = List.of("a", "s", "d", "f");
        List<String> wordListB = new ArrayList<>();
        wordListB = List.of("b", "s", "g", "f");
        List<String> result = new ArrayList<>();

        for (String sA : wordListA) {
            for (String sB : wordListB) {
                if (sA.equals(sB)) {
                    result.add(sA);
                }
            }
        }
        System.out.println(result);
    }


}
