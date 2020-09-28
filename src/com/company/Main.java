package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double D, X1, X2;
        double a = scan.nextFloat();
        double b = scan.nextFloat();
        double c = scan.nextFloat();
        D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("Нет корней");
        }
        if (D == 0) {
            X1 = b + Math.sqrt(D) / (2 * a);
            System.out.println(X1);
        }
        if (D > 0) {
            X1 = b + Math.sqrt(D) / (2 * a);
            X2 = b - Math.sqrt(D) / (2 * a);
            System.out.println(X1);
            System.out.println(X2);
        }
    }
}
