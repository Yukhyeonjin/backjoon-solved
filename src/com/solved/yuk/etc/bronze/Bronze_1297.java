package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int D = Integer.parseInt(input[0]), // 대각선
            H = Integer.parseInt(input[1]), // 높이 비율
            W = Integer.parseInt(input[2]); // 너비 비율
        // D제곱 = x*H제곱 + x*W제곱 -> x(H제곱 + W제곱)
        // x = D제곱 / (H제곱 + W제곱)
        double x = Math.sqrt(Math.pow(D,2) / (Math.pow(H,2) + Math.pow(W,2)));
        bw.write((int)Math.floor(x*H) + " " + (int)Math.floor(x*W));

        bw.flush();
        bw.close();

    }
}
