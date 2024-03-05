package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_31472 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int W = Integer.parseInt(br.readLine());
        // x * (1/2 * x) = W
        int x = 2;
        while (true) {
            if (x * (x / 2) == W) break;
            x+=2;
        }
        bw.write(4*x+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}