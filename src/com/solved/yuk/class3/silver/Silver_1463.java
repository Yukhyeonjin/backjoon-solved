package com.solved.yuk.class3.silver;

import java.io.*;

public class Silver_1463 {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // class3
        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;
        bw.write(Integer.toString(findMindp(N)));
        bw.flush();
        bw.close();
    }

    public static int findMindp(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(findMindp(n - 1), Math.min(findMindp(n / 3), findMindp(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(findMindp(n / 3), findMindp(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(findMindp(n / 2), findMindp(n - 1)) + 1;
            } else {
                dp[n] = findMindp(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
