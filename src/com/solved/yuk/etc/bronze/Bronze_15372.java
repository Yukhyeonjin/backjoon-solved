package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_15372 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());


        for(int i = 0; i < t; i++) {

            long a = Long.parseLong(br.readLine());

            long b = (long)Math.pow(a,2);

            bw.write( b + "\n");

        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
