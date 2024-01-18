package task4;

public class Main {
    public static void main(String[] args) {
        String string = "345445";
        StringBuilder newStr =new StringBuilder();
        String str;
        for(int i=0; i< string.length(); i++){
            str = String.valueOf(string.charAt(i));
            if(!newStr.toString().contains(str)){
                newStr.append(str);
            }
        }
        System.out.println(newStr);
    }
}
