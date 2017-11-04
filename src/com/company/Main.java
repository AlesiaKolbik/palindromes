package com.company;
import  java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int num=i;
            String s1=new String("i");
            int len1=s1.length();
            int[] count;
            count = new int[s1.length()];
            while (num != 0) {
                count[i] = num % 10;
                num = num / 10;
            }
        }
    }
}
