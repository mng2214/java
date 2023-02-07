package groupProject4and5;

public class task5 {
    public static void main(String[] args) {

        String str = "i am happy";
        String strNew = "";

        for (int i = 0; i < str.length(); i++) {
            String letter = str.charAt(i) + "";
            if (!strNew.contains(letter)) {
                strNew += letter;
            } else if (letter.equalsIgnoreCase(" ")) {
                strNew += letter;
            }
        }
        System.out.println(strNew);

    }
}
