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
        boolean bingo = false;
        StringBuilder newString = new StringBuilder();
        while (stringList.size() > 1) {
            String maxWord = "";
            int maxLength = 0;
            for (String s : stringList) {
                maxLength = Math.max(maxLength, s.length());
                if (maxLength > 14) {
                    bingo = true;
                }
            }
            for (String s : stringList) {
                if (maxLength == s.length()) {
                    maxWord = s;
                    break;
                }
            }
            newString.append(maxWord);
            stringList.remove(maxWord);
        }
        if (bingo) {
            System.out.println("BINGO");
        }
        newString.append(stringList.get(0));
        return newString.toString();
    }
}
