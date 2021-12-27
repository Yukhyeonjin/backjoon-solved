package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+2];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        bw.write(dp(dp,n)+"");

        bw.flush();
        bw.close();
    }
    public static int dp(int[] dp, int n){
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1]+dp[i-2]) % 10007;
        }
        return dp[n];
    }
}
