package com.solved.yuk.etc.bronze;

import java.util.Scanner;

public class Bronze_13597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(a);
        } else {
            if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}

