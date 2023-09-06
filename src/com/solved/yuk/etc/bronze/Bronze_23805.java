package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_23805 {

    static StringBuilder sb = new StringBuilder();
    private static void print(char c, int cnt) {
        while (cnt-->0) sb.append(c);
    }
    private static void br() {sb.append('\n');}

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            print('@', 3*n);
            print(' ', n);
            print('@', n);
            br();
        }
        for (int i = 0; i < 3*n; i++) {
            print('@', n);
            print(' ', n);
            print('@', n);
            print(' ', n);
            print('@', n);
            br();
        }
        for (int i = 0; i < n; i++) {
            print('@', n);
            print(' ', n);
            print('@', 3*n);
            br();
        }
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

