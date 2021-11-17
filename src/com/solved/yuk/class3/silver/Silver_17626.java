package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;

        for(int i = 2; i <= n; i ++){
            int min = Integer.MAX_VALUE;
            for( int j = 1; j * j <= i; j++){
                min = Math.min(min,dp[i-j*j]);
            }
            dp[i] = min + 1;
        }
        bw.write(Integer.toString(dp[n]));

        bw.flush();
        bw.close();
    }
}
