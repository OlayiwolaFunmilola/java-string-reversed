package com.funmi;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter word to reverse: ");
//        String value = scanner.nextLine();


//        System.out.println(reverseWord(value));

        System.out.println("word to count: ");
        String value = scanner.nextLine();

        System.out.println("the number of letters in the word " + value + " is:  " + countWordLength(value));
        scanner.close();


    }

    public static String reverseWord(String value){

        String reversed = "";
        for (int i = value.length()-1;i >= 0; i--) {
            reversed = reversed + value.charAt(i);
        }
        return reversed;

    }


    public static int countWordLength (String value){
        return value.length();
    }

    }



