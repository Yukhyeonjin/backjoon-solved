package com.solved.yuk.class1.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] number = br.readLine().split(" ");
        int a = Integer.parseInt(number[0]),
            b = Integer.parseInt(number[1]);
        String result = a > b ? ">" : (a == b ? "==" : "<");
        System.out.println(result);
    }
}
