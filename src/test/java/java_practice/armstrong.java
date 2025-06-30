package java_practice;

import java.util.Scanner;

public class armstrong {

    static int fact(int num){
        int f = 1;
        for (int i = 1; i <= num; i++){
            f = f * i;
        }
        return f;
    }

    public static void main (String [] args) {
        System.out.println("****************************");

        Scanner sc = new Scanner(System.in);
        int givenNumber = sc.nextInt();
        int temp = givenNumber;
        int sum = 0;

        while (givenNumber > 0){
            int rem = givenNumber % 10;
            sum = sum + fact(givenNumber);
            givenNumber = givenNumber / 10;
        }

        if(sum == temp){
            System.out.println("It is a armstrong number " + sum);
        }
        else {
            System.out.println("It is not a armstrong number " + sum);
        }
        System.out.println("****************************");
    }
}
