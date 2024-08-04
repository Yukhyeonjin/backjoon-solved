package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_26767 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i ++){
            if (i % 7 == 0 && i % 11 == 0) {
                bw.write("Wiwat!\n");
            }
            else if (i % 7 == 0) {
                bw.write("Hurra!\n");
            }
            else if (i % 11 == 0) {
                bw.write("Super!\n");
            }
            else {
                bw.write(i+"\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}