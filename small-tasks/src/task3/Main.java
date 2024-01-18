package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wordListA = new ArrayList<>();
        wordListA = List.of("abba", "sorol", "görög", "felel");
        List<String> result = new ArrayList<>();
        for (String s: wordListA) {
            StringBuilder newStr = new StringBuilder();
            for(int i=s.length()-1; i>=0; i--){
                String word = String.valueOf(s.charAt(i));
                newStr.append(word);
            }
            if((newStr.toString()).equals(s)){
                result.add(s);
            }
        }
        System.out.println(result);
    }
}
