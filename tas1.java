package com.company;
import java.util.Scanner;
public class tas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Time(n);
    }
    public  static void Time(int n){
        n=n*60;
        System.out.println(n);
    }
}
