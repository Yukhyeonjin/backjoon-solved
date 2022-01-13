package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= (2 * N) - 1; i++) {
            if (i <= N) {
                for (int k = 1; k < i; k++) {
                    bw.write(" ");
                }
                for (int j = i; j <= N; j++) {
                    bw.write("*");
                }
                for (int j = i; j < N; j++) {
                    bw.write("*");
                }
            } else {
                for (int k = i+1; k < N*2; k++) {
                    bw.write(" ");
                }
                for (int j = N; j <= i; j++) {
                    bw.write("*");
                }
                for (int j = N; j < i; j++) {
                    bw.write("*");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
