package groupProject2;

public class task3 {
    public static void main(String[] args) {

        String word1 = "  Snicker ", word2 = "cookie";

        System.out.println(word1.trim()) ;                         // Word # 1 below
        System.out.println(word1.toUpperCase());
        System.out.println(word1.substring(0, 4));
        System.out.println(word1.charAt(2));


        System.out.println(word2.toLowerCase());                   // Word # 2 below
        System.out.println(word2.replace('o', 'u'));
        System.out.println(word2.concat("s"));
        System.out.println(word2.startsWith("C"));



    }
}
