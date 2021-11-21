package com.solved.yuk.etc.bronze;

import java.util.*;

public class Bronze_15727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        sc.close();
        if(num % 5 != 0)
            System.out.print(num/5 + 1);
        else
            System.out.print(num/5);

    }
}