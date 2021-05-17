package com.company;

import java.util.Scanner;

public class tas6 {
    public static void main(String[] args){
        System.out.println("Введите количество квадратных метров, которые вы можете нарисовать");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Введите ширину одной стены в метрах");
        int w=scanner.nextInt();
        System.out.println("Введите высоту одной стены в метрах");
        int h=scanner.nextInt();
        Poln(n,w,h);
    }
    public static double Poln(int n, int w, int h){
        int pol = n/(w*h);
        System.out.println(pol);
        return pol;
    }
}
