package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wordListA = new ArrayList<>();
        wordListA = List.of("alma", "sorol", "dörög", "felel");
        List<String> result = new ArrayList<>();
        for (String s: wordListA) {
            StringBuilder newStr = new StringBuilder();
            for(int i=s.length()-1; i>=0; i--){
                String word = String.valueOf(s.charAt(i));
                newStr.append(word);
            }
            result.add(newStr.toString());
        }
        System.out.println(result);
    }
}
