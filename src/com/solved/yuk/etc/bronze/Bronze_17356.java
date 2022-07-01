package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Bronze_17356 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        double M = (double) (B - A) / 400;
        System.out.printf("%.6f", 1 / (1 + Math.pow(10, M)));

        bw.flush();
        br.close();
        bw.close();
    }
}
