package com.company;
import java.util.Scanner;
import java.util.SplittableRandom;

public class tas5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Boolean s =scanner.nextBoolean();
        Boolean ss =scanner.nextBoolean();
        if (s&&ss){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
