package com.company;
import java.util.Scanner;

public class tas4 {
    public static void main(String[] args){
        System.out.println(Vozrat());
    }
    public static Boolean Vozrat(){
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%5==0){
            return true;
        } else{
            return false;
        }
    }
}
