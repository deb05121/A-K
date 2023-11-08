package string;

public class LetterMultiplier {
    public static void main(String[] args) {
        String newStr;
        String str = "sherlock";
        int num = 4;
        newStr = getNewString(str, num);
        System.out.printf("The new string: %s\n", newStr);
    }

    private static boolean isValidText(String str) {
        return str.matches(("[a-zA-Z]+"));
    }

    private static String getNewString(String str, int num) {
        StringBuilder newStr = new StringBuilder();
        boolean validStr = isValidText(str);
        if(validStr){
            int len = str.length();
            for (int i = 0; i < len; i++) {
                String letter = String.valueOf(str.charAt(i));
                newStr.append(letter.repeat(Math.max(0, num)));
            }
        }else {
            return "";
        }
        return newStr.toString();
    }
}
