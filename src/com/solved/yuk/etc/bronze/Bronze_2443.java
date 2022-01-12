package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        for (int i = 1; i <= N; i++) {
            for(int k = 1; k < i; k++){
                bw.write(" ");
            }
            for (int j = (2*N-(i+count) ); j >= 1; j--) {
                bw.write("*");
            }
            bw.newLine();
            count++;
        }
        bw.flush();
        bw.close();
    }
}
