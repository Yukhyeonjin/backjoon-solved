package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 2;
        for (int i = 1; i <= (2 * N) - 1; i++) {
            if (i <= N) {
                for (int k = N; k > i; k--) {
                    bw.write(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++) {
                    bw.write("*");
                }
                bw.newLine();
            } else {
                for (int k = 0; k < i-N; k++) {
                    bw.write(" ");
                }
                for (int j = (2 * N - (i-N + count)); j >= 1; j--) {
                    bw.write("*");
                }
                bw.newLine();
                count++;
            }
        }
        bw.flush();
        bw.close();
    }
}
