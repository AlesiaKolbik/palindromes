package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int N = in.nextInt();
        for (int i = 1; i < N; i++) {
            if (i < 10) {
                System.out.print(i + " ");
            }
            if (i >= 10 && i < 100) {
                int a = i % 10;
                int b = (i - a) / 10;
                if (a == b) {
                    System.out.print(i + " ");
                }
            }
            if (i >= 100 && i < 1000) {
                int c = i % 10;
                int e = i % 100;
                int d = (i - e) / 100;
                if (c == d) {
                    System.out.print(i + " ");
                }
            }
            if (i >= 1000 && i < 10000) {
                int f = i % 10;
                int f2 = ((i - f) / 10) % 10;
                int f3 = (i /100)% 10;
                int f4 = i/1000;
                if (f == f4 && f2 == f3) {
                    System.out.print(i + " ");
                }
            }
            if (i >= 10000 && i < 100000) {
                int n = i % 10;
                int n2 = ((i - n) / 10) % 10;
                int n4 = (i / 1000) % 10;
                int n5 = i/ 10000;
                if (n == n5 && n2 == n4) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
