package java_practice;

public class vowelsFromWord {
    public static void main(String [] args) {
        System.out.println("************************************");

        String word = "WelcometoIndia";
        String vowels = "";

        for (int i = 0; i < word.length(); i++) {
            char letter = word.toLowerCase().charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowels = vowels + ' ' + letter;
            }
        }
        System.out.println(vowels);
        System.out.println("************************************");
    }
}
