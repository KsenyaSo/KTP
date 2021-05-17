package com.company;
import java.util.Scanner;
public class tas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Basket(n,m);
    }
    public static double Basket(int n, int m)
    {
        int sym=n*2+m*3;
        System.out.println(sym);
        return  sym;
    }
}
