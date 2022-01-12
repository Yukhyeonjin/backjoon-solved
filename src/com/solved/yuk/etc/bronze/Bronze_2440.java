package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = N; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
