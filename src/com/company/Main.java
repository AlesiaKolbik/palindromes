package com.company;
import  java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int N = in.nextInt();
        int n = 0;
        String digit = Integer.toString(N);
        int index= digit.length()-1;
        for (int i = 0; i < digit.length() / 2; i++) {
            char symbol = digit.charAt(i);
            char symbolLast = digit.charAt(index);
            if (symbol == symbolLast) {
                n++;
                index--;
            }
        }
        if (n == digit.length() / 2) {
            System.out.print("Число " + N + " является полиндромом.");
        }
        else {
            System.out.print("Число " + N + " не является полиндромом.");
        }
    }
}
