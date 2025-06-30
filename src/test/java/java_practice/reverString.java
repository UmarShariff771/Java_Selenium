package java_practice;

public class reverString {

    public static void main(String [] args) {
        System.out.println("****************************");
        String text1 = "Umar Shariff";
        String text2 = "";

        for(int i=text1.length()-1; i>=0; i--){
            char letter = text1.charAt(i);
            text2 = text2 + letter;
        }
        System.out.println(text2);
        System.out.println("****************************");
    }
}
