package characterCounter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Cicamica";
        char chr = 'c';
        int result = findCharacter(str, chr);
        if(result>0){
            System.out.printf("It is found %d pieces \"%s\" character in %s.", result, chr, str);
        }else {
            System.out.printf("It isn't found \"%s\" character in %s.", chr, str);

        }
    }

    private static int findCharacter(String str, char chr) {
        int counter = 0;
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            charList.add(str.charAt(i));
        }
        for (Character c : charList) {
            if (c.equals(chr)) {
                counter++;
            }
        }
        if (counter == 0) {
            counter = -1;
        }
        return counter;
    }
}
