package java_practice;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main (String [] args) {
        System.out.println("****************************");
        int fiblength;

        Scanner sc = new Scanner(System.in);
        fiblength = sc.nextInt();

        int num[] = new int[fiblength];
        num[0] = 0;
        num[1] = 1;

        for(int i=2; i<fiblength; i++){
            num[i]= num[i-1] + num[i-2];
        }

        System.out.println("The Fibonacci series is ");
        for(int i=0; i<fiblength; i++){
            System.out.println(num[i] + " ");
        }
        System.out.println("****************************");
    }
}
