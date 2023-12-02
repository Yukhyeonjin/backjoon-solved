package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11312 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        long A, B;
        String[] input;
        for(int i = 0; i < T; i ++){
            input = br.readLine().split(" ");
            A = Long.parseLong(input[0]);
            B = Long.parseLong(input[1]);
            bw.write((A*A)/(B*B)+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
    }
}
