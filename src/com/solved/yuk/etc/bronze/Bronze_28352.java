package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_28352 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        bw.write((factorial(N) / 60 / 60 / 24 / 7)+"");

        bw.flush();
        br.close();
        bw.close();
    }

    static public long factorial(long n) {
        if (n == 1) return 1;
        else return n * factorial(n-1);
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
