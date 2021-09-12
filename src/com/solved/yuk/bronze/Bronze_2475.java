package com.solved.yuk.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int sum = 0;
        for(int i = 0; i < str.length; i ++){
            sum += Math.pow(Double.parseDouble(str[i]), 2);
        }
        int result = sum%10;
        System.out.println(result);
    }
}
