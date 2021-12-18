package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]),
            M = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");

        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = Integer.parseInt(input[0]);
        for(int i = 2; i <= N; i ++){
            dp[i] = Integer.parseInt(input[i-1]) + dp[i-1];
        }
        for(int i = 0; i < M; i ++){
            input = br.readLine().split(" ");
            int I = Integer.parseInt(input[0]),
                J = Integer.parseInt(input[1]);
            bw.write(dp[J] - dp[I-1]+"\n");
        }

        bw.flush();
        bw.close();
    }
}
