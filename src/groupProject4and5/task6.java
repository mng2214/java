package groupProject4and5;

public class task6 {
    public static void main(String[] args) {

        String str = "ImStudent";

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 'A' && str.charAt(i) < 'Z') {// true
                newStr+=" ";

            }
            newStr += str.charAt(i);
        }
        System.out.println(newStr.trim());


    }
}
