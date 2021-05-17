package com.company;

import java.util.Scanner;

public class tas9 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество минут, затем FPS");
        int minute=scanner.nextInt();
        int FPS=scanner.nextInt();
        System.out.println(frames(minute,FPS));
    }
    public static int frames(int minute, int FPS){return FPS*minute*60;}
}
