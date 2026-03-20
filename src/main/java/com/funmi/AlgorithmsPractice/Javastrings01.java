package com.funmi.AlgorithmsPractice;

public class Javastrings01 {
    static void main(String[] args) {

//        String literals  stored in String pool
//        str and str1 are pointing to the same literal
        String str = "Hello";
        String str1 = "Hello";

//        we are comparing hashCodes of str and str1 which is the same for a String "Hello"
        if(str == str1){
            System.out.println("str == str1");
            }else{
            System.out.println("str != str1");{

            }
            String str2 = new String("Hello");
            String str3 = new String("Hello");

            if(str2 == str3){
                System.out.println("str2 == str3");
            }else{
                System.out.println("str2 != str3");{

                }
            }

                }

    }

}
