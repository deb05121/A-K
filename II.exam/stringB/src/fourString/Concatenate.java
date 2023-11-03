package fourString;

import java.util.ArrayList;
import java.util.List;

public class Concatenate {
    public static void main(String[] args) {
        String first, second, third, forth;
        first = "a";
        second = "bb";
        third = "cccc";
        forth = "ddd";
        List<String> strList = new ArrayList<>();
        strList.add(first);
        strList.add(second);
        strList.add(third);
        strList.add(forth);
        String newStr = getNewString(strList);
        System.out.println(newStr);
    }

    private static String getNewString(List<String> stringList) {
        StringBuilder newString = new StringBuilder();
        int max;
        while (!stringList.isEmpty()) {
            max = 0;
            String maxWord = "";
            for (String s : stringList) {
                if (max < s.length()) {
                    max = s.length();
                    if (max > 14) {
                        System.out.println("BINGO");
                    }
                    maxWord = s;
                }
            }
            newString.append(maxWord);
            stringList.remove(maxWord);
        }
        return newString.toString();
    }
}
