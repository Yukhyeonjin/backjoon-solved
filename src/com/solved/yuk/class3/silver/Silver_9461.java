package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_9461 {
    static long[] p;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        p = new long[101];
        p[1] = p[2] = p[3] = 1;
        p[4] = p[5] = 2;
        for (int i = 6; i < p.length; i++) {
            p[i] = p[i - 1] + p[i - 5];
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            bw.write(p[Integer.parseInt(br.readLine())] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
