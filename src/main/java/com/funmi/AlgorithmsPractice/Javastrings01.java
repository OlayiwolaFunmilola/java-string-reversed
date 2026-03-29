package com.funmi.AlgorithmsPractice;

public class Javastrings01 {
    static void main(String[] args) {

//        String literals  stored in String pool
//        str and str1 are pointing to the same literal
        String str = "Hello";
        String str1 = "Hello";

//        we are comparing hashCodes of str and str1 which is the same for a String "Hello"
//        if(str == str1){
//            System.out.println("str == str1");
//            }else {
//            System.out.println("str != str1");{
//
//            }


        String str2 = new String("Hello");
        String str3 = new String("Hello");

//        if (str2 == str3) {
//            System.out.println("str2 == str3");
//        } else {
//            System.out.println("str2 != str3");
//        }


        if (str2.compareTo(str3) == 0) {
            System.out.println("str2 compared to str3");
        } else {
            System.out.println("str2 not compared to str3");
        }



        String str4 = "Love, Joy, Peace, Care";

        System.out.println("str4 is: " + str4);

        int len = str4.length();

        System.out.println("Length of str4 is : " + len);
        System.out.println(str4.charAt(0) + " | " + str4.charAt(len - 1));

        String s1 = str4.toUpperCase();
        System.out.println("str4 after upper case is : " + str4);
        System.out.println("s1 is : " + s1);

        System.out.println("Joy is in the string");

    }

}


