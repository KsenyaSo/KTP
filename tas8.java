package com.company;

import java.util.Scanner;

public class tas8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double prod=scanner.nextDouble();
        double prize=scanner.nextDouble();
        double pay=scanner.nextDouble();
        System.out.println(Ysl(prod,prize,pay));
    }
    public static Boolean Ysl(double p,double pr,double pa){
        if (pr*p>pa){
            return true;
        } else{
            return false;
        }
    }
}
