package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for(int k = 0; k < i; k++){
                bw.write(" ");
            }
            for (int j = N; j > i; j--) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
