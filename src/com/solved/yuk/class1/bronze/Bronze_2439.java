package com.solved.yuk.class1.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String star = "*";
        for(int i = 0; i < count; i ++) {
            for(int j = i ; j < count-1; j ++) {
                System.out.printf(" ");
            }
            for(int k = 0; k <= i; k ++){
                System.out.printf(star);
            }
            if(i == count) break;
            System.out.println();
        }
    }
}
