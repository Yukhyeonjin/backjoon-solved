package com.solved.yuk.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[3];
        int sum = 1;
        for(int i = 0; i < 3; i ++) {
            sum *= Integer.parseInt(br.readLine());
        }
        String[] sumStr = String.valueOf(sum).split("");
        for(int i = 0; i <= 9; i ++) {
            int count = 0;
            for(int j = 0; j < sumStr.length; j ++){
                if(Integer.parseInt(sumStr[j]) == i) count++;
            }
            System.out.println(count);
        }
    }
}
