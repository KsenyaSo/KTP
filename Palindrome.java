package com.company;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome work");
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        isPalindrome(s);
        //if(s.length == 0) System.out.println("no data");
        //else System.out.println(isPalindrome(args[0]));
        //for (int i = 0; i < args.length; i++) {
          //  String s = args[i];
        }
    public static String reverseString(String s) {
        String r = "";
        // берем символы исходной строки с конца строки до начала
        // и добавляем ее в начала строки-результата (переменная r)
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }
    public static Boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))){
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));
    }
}
