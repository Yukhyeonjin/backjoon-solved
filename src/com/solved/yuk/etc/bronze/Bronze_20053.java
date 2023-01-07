package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_20053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine()),
                max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            String input[] = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                int number = Integer.parseInt(input[j]);
                max = Math.max(number, max);
                min = Math.min(number, min);
            }
            bw.write(min + " " + max + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

