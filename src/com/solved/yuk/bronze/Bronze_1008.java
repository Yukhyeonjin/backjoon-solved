package com.solved.yuk.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1008 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        double a = Integer.parseInt(strs[0]);
        double b = Integer.parseInt(strs[1]);
        System.out.println(a/b);
    }
}
