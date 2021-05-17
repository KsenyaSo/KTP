package com.company;

import java.util.Scanner;

public class tas10 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int d=scanner.nextInt();
        System.out.println(remaid(n,d));
    }
    public static int remaid(int n,int d){
        return n - n / d * d;
    }
}
