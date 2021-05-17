package com.company;

public class task2 {
    public static void main(String[] args){
        System.out.println("Задание 1 = " + oppositeHouse(1,3));
        System.out.println("Задание 2 = " + nameShuffle("Donald Trump"));
        System.out.println("Задание 3 = " + discount(89,20));
        System.out.println("Задание 4 = " + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("Задание 5 = " + equal(3,4,3));
        System.out.println("Задание 6 = " + reverse("Hello World"));
        System.out.println("Задание 7 = " + programmers(147, 33, 526) );
        System.out.println("Задание 8 = " + getXO("zp") );
        System.out.println("Задание 9 = " + bomb("Bomb"));
        System.out.println("Задание 10 = " + sameAscii("a","bd"));
    }
    /* Метод для задачи 1 из блока 2/6
    Теша шел по прямой улице, по обеим сторонам которой стояло ровно n одинаковых домов.
    Номера домов на улице выглядят так:
1 | | 6

3 | | 4

5 | | 2
    Она заметила, что четные дома увеличиваются справа, а нечетные уменьшаются слева.
    Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер
    дома на противоположной стороне.*/
    public static int oppositeHouse(int namber, int dlina){
        int chetn []=new int[dlina]; int nechetn []=new int[dlina];
        for (int i=0;i<dlina;i++) {
            for (int k = 1; k < 2 * dlina + 1; k++) {
                if (k % 2 == 0) {
                    chetn[i] = k;
                } else {
                    nechetn[i] = k;
                }
            }
        }
        if (namber%2==0){
            return nechetn[namber];
        } else{
            return chetn[namber];
        }
    }
    /*Метод для задачи 2 из блока 2/6
    Создайте метод, который принимает строку (имя и фамилию человека) и возвращает строку с
    заменой имени и фамилии.
     */
    public static String nameShuffle(String message){

        String[] strings = message.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i] + " ");
        }
        return sb.toString().trim();
    }
    /*Метод для задачи 3 из блока 2/6
    Создайте функцию, которая принимает два аргумента: исходную цену и процент скидки в виде целых чисел
    и возвращает конечную цену после скидки.
     */
    public static double discount(double cost, double pro){return cost - pro*cost/100;}
    /*
    Метод для задачи 4 из блока 2/6
    Создайте функцию, которая принимает массив и возвращает разницу между наибольшим и наименьшим числами.
     */
    public static int differenceMaxMin(int[] mas){
        int max=-1000000000;
        int min=1000000000;
        for (int i:mas){
            if (max<i){
               max=i;
            }
            if (min>i){
                min=i;
            }
        }
        return max-min;
    }
    /*
    Метод для задачи 5 из блока 2/6
    Создайте функцию, которая принимает три целочисленных аргумента (a, b, c) и
    возвращает количество целых чисел, имеющих одинаковое значение.
     */
    public static int equal(int a, int b, int c){
        int k=0;
        if (a==b) k++;
        if (a==c) k++;
        if (b==c) k++;
        if (((a==c)&(a!=b))||((b==c)&(a!=b))||((a==b)&(a!=c))) k++;
        return k;
    }
    /*
    Метод для задачи 6 из блока 2/6
    Создайте метод, который принимает строку в качестве аргумента и возвращает ее в обратном порядке.
     */
    public static String reverse(String s){return new StringBuilder(s).reverse().toString();}
    /*
    Метод для задачи 7 из блока 2/6
    Вы наняли трех программистов и (надеюсь) платите им. Создайте функцию, которая принимает три числа
    (почасовая заработная плата каждого программиста) и возвращает разницу между самым высокооплачиваемым
    программистом и самым низкооплачиваемым.
     */
    public static int programmers(int p1,int p2, int p3){
        int maxzp,minzp;
        maxzp=Math.max(p1,Math.max(p2,p3));
        minzp=Math.min(p1,Math.min(p2,p3));
        return maxzp-minzp;
    }
    /*
    Метод для задачи 8 из блока 2/6
    Создайте функцию, которая принимает строку, проверяет, имеет ли она одинаковое количество x и o и
    возвращает либо true, либо false.
Правила:
- Возвращает логическое значение (true или false).
- Верните true, если количество x и o одинаковы.
- Верните false, если они не одинаковы.
- Строка может содержать любой символ.
- Если "x" и "o" отсутствуют в строке, верните true.
    */
    public static boolean getXO(String s){
        int countX=0,countO=0;
        char[] t=s.toCharArray();
        for (int i=0; i<t.length;i++){
            if (t[i]=='x'||t[i]=='X') countX++;
            if (t[i]=='o'||t[i]=='O') countO++;
        }
        return countO==countX;
    }
    /*
    Метод для задачи 9
    Напишите функцию, которая находит слово "бомба" в данной строке. Ответьте "ПРИГНИСЬ!",
    если найдешь, в противном случае:"Расслабься, бомбы нет".
     */
    public static String bomb(String str){
        String d;
        if (str.contains("bomb")||str.contains("Bomb")||str.contains("BOMB")){
            d="DUCK!";
        } else {
            d="Relax, there's no bomb";
        }
        return d;
    }
    /*
    Метод для задачи 10
    Возвращает true, если сумма значений ASCII первой строки совпадает с суммой
    значений ASCII второй строки, в противном случае возвращает false.
     */
    public static boolean sameAscii(String s, String t){
        int sumS=0;int sumT=0;
        char[] arrayS=s.toCharArray();
        char[] arrayT=t.toCharArray();
        for (int i=0; i<arrayS.length;i++){
            sumS+=(int)arrayS[i];
        }
        for (int i=0; i<arrayT.length;i++){
            sumT+=(int)arrayT[i];
        }
        return sumS==sumT;
    }
}