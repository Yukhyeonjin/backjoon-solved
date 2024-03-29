package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13484 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine().trim());
        int N = Integer.parseInt(br.readLine().trim());

        int avail = X;
        for (int i = 0; i < N; i ++){
            int spend = Integer.parseInt(br.readLine().trim());
            avail += (X - spend);
        }
        bw.write(avail+"");

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
