package com.solved.yuk.class1.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int order = 0;
        for(int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > max) {
                max = num;
                order = i+1;
            }
        }
        System.out.printf("%d\n%d",max, order);
    }
}
