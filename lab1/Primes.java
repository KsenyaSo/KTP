package com.company;

public class Primes {

    public static void main(String[] args) {
        System.out.println("Program work");
        for (int i=2;i<101;i++)
        {
           if (isPrime(i)){
               System.out.println(i);
           };
        }
    }
    public static boolean isPrime(int i){
        // Проверка на простое число
        if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
}
