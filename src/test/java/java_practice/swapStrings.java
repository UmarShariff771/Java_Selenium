package java_practice;

public class swapStrings {
    public static void  main (String [] args) {
        String text1 = "Welcome";
        String text2 = "back";

        text1 = text1 + text2;

        text2 = text1.substring(0, text1.length() - text2.length());
        System.out.println(text2);

        text1 = text1.substring(text2.length());

        System.out.println(text1);
        System.out.println(text2);
    }
}
