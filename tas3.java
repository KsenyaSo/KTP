package com.company;
import java.util.Scanner;
public class tas3 {
    public static void main(String[] args) {
        System.out.println("Введите количество побед");
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        System.out.println("Введите количество ничьих");
        int n = scanner.nextInt();
        System.out.println("Введите количество поражений");
        int p= scanner.nextInt();
        Result(w,n,p);
    }
    public static double Result(int w, int n, int p){
        int sym= w*3+n*1+p*0;
        System.out.println(sym);
        return sym;
    }
}
