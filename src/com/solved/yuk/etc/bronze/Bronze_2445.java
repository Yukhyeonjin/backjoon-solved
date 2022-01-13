package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= (2 * N) - 1; i++) {
            if (i <= N) {
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
                for (int k = i; k < N; k++) {
                    bw.write(" ");
                }
                for (int k = i; k < N; k++) {
                    bw.write(" ");
                }
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
            } else {
                for (int j = i; j < 2 * N; j++) {
                    bw.write("*");
                }
                for (int k = i; k > N; k--) {
                    bw.write(" ");
                }
                for (int k = i; k > N; k--) {
                    bw.write(" ");
                }
                for (int j = i; j < 2 * N; j++) {
                    bw.write("*");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
