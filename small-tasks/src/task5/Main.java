package task5;

public class Main {
    public static void main(String[] args) {
        String stringA = "3456783";
        String stringB = "012345";
        int result = printMoreUniqueCharOfStrings(stringA, stringB);
        System.out.println(result);

    }

    private static int printMoreUniqueCharOfStrings(String stringA, String stringB) {
        int uniqueCharPiecesA = 0;
        int uniqueCharPiecesB = 0;

        StringBuilder newStrA = new StringBuilder();
        String str;
        for (int i = 0; i < stringA.length(); i++) {
            str = String.valueOf(stringA.charAt(i));
            if (!newStrA.toString().contains(str)) {
                newStrA.append(str);
                uniqueCharPiecesA++;
            }
        }
        StringBuilder newStrB = new StringBuilder();
        str="";
        for (int i = 0; i < stringB.length(); i++) {
            str = String.valueOf(stringB.charAt(i));
            if (!newStrB.toString().contains(str)) {
                newStrB.append(str);
                uniqueCharPiecesB++;
            }
        }
        //System.out.println(uniqueCharPiecesA);
        //System.out.println(uniqueCharPiecesB);
        if(uniqueCharPiecesA>uniqueCharPiecesB){
            return 1;
        } else if(uniqueCharPiecesB>uniqueCharPiecesA){
            return 2;
        }else{
            return 0;
        }
    }
}
