package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int T = Integer.parseInt(br.readLine()),
            max = -1, input;
        int[] dp = new int[12];
        dp[0] = 0;
        dp[1] = 1; // 1
        dp[2] = 2; // 1+1, 2
        dp[3] = 4; // 1+1+1, 2+1, 1+2, 3
        // 4 = 1 + 3(dp[3]),  2 + 2(dp[2]),  3 + 1(dp[1])
        // 5 = 1 + 4(dp[4]),  2 + 3(dp[3]),  3 + 2(dp[2])
        for(int i = 4 ; i < dp.length; i ++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        for(int i = 0;i < T; i++){
            input = Integer.parseInt(br.readLine());
            bw.write(dp[input]+"\n");
        }
        bw.flush();
        bw.close();
    }

}
