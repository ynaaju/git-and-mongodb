package com.company;

public class StringOperations {
    public static void main(String[] args) {
        String str = "Java String pool refers to collection of strings which are stored in heap memory";
        String str1 = "java String pool refers to collection of strings which are stored in heap memory";

        //String str1=str.toLowerCase();
        //String str1=str.toUpperCase();
        //String str1=str.replace('a','$');
        /*if (str.contains("Collection")) {
            System.out.println("contains");
    } else {
            System.out.println("does not contains");
        }*/


        System.out.println(str);
        System.out.println(str1);
        System.out.println(str1);
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
    }



    }
