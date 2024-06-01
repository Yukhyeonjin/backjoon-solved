package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31134 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long x;
        for (int i = 0; i < N; i ++){
            x = Long.parseLong(br.readLine());
            bw.write((x*2-1)+"\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}