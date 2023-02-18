package com.sahil;

import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int i = n % 10;
            n = n / 10;
            sum += i;
            product = product * i;

        }
        System.out.println(sum);
        System.out.println(product);
    }
}
