package com.solved.yuk.etc.bronze;

import java.util.Scanner;

public class Bronze_25191 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = a/2+b;
        System.out.println(Math.min(n, cnt));

    }
}
