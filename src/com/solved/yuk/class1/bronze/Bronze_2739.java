package com.solved.yuk.class1.bronze;

import java.io.*;

public class Bronze_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= 9; i ++) {
            System.out.printf("%d * %d = %d\n", N, i, N*i);
        }
    }
}
